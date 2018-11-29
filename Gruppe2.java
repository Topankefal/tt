package com.example.meistermeister.tt;

import java.util.ArrayList;

public class Gruppe2 {
    Mannschaftseingabe2 teilnehmer;
    ArrayList<Mannschaftsobjekt2> mannschaften= new ArrayList<>();
    Mannschaftsobjekt2[][] gruppen = new Mannschaftsobjekt2[teilnehmer.gruppen][teilnehmer.mpg];
    int countervariable=0;

    public void erstelleGruppen () {
        mannschaften = teilnehmer.teilnehmer;
        for (int i=0;i<teilnehmer.gruppen;i++){
            for (int j=0;j<teilnehmer.mpg;j++){
                gruppen[i][j]=mannschaften.get(countervariable);
                countervariable++;
            }

        }
    }
    public Mannschaftsobjekt2[][] getGruppen(){
        return gruppen;
    }
}
