package com.example.meistermeister.tt;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Mannschaftseingabe2 extends AppCompatActivity {
    Turnier_Erstellen2 turnier = new Turnier_Erstellen2();
    public int gruppen = turnier.getgruppen();
    public int mannschaften =turnier.getMannschaften();
    public static int mpg;
    public ArrayList<TextView> textviewlist = new ArrayList<>();
    public ArrayList<EditText> edittextlist = new ArrayList<>();
    public static ArrayList<Mannschaftsobjekt2> teilnehmer= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Resources res = getResources();
        String[] grnamen= res.getStringArray(R.array.abc);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mannschaftseingabe2);
        for (int x = 0; x < gruppen; x++) {
            textviewlist.add(new TextView(this));
            textviewlist.get(x).setText(grnamen[x]);
            textviewlist.get(x).setTextSize(30);
            textviewlist.get(x).setTypeface(null, Typeface.BOLD);
        }
        for (int x = 0; x < mannschaften; x++) {
            edittextlist.add(new EditText(this));
            edittextlist.get(x).setId(x);
        }

        for (int x=0;x<mannschaften;x++){
            teilnehmer.add(new Mannschaftsobjekt2());
        }

        mpg(gruppen, mannschaften);
        liste_erstellen();
    }

    public void mpg(int gruppen, int mannschaften) {
        if (mannschaften % gruppen == 0) {
            mpg = mannschaften / gruppen;
        }
    }

    public void addtextview(int y,LinearLayout ll) {
        ll.addView(textviewlist.get(y));
    }

    public void addedittext(int x,LinearLayout ll){
        ll.addView(new EditText(this));
    }

    public void openmenu() {
        for (int x=0;x<mannschaften;x++){
            teilnehmer.get(x).setMannschaftsname(edittextlist.get(x).getText().toString());
        }
        Intent intent = new Intent(this,Menu2.class);
        startActivity(intent);
    }

    public void liste_erstellen() {
        LinearLayout ll = (LinearLayout) findViewById(R.id.linearlayout);
        for (int x = 0; x < gruppen; x++) {
            addtextview(x,ll);
            for (int y=0;y<mpg;y++){
                addedittext(y,ll);
            }
        }
        Button button2 = new Button(this);
        button2.setText("Weiter");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmenu();
            }
        });
        ll.addView(button2);

    }
}
