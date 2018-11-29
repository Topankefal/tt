package com.example.meistermeister.tt;

public class Mannschaftsobjekt2 {
    public String gruppenbuchstabe;
    public String mannschaftsname;
    public int tore,gegentore,punkte,tordifferenz=tore-gegentore;

    public Mannschaftsobjekt2(){
        gruppenbuchstabe= "default";
        mannschaftsname="default";
        punkte=0;
    }

    public String getgruppenbuchstabe() {
        return gruppenbuchstabe;
    }

    public String getmannschaftsname() {
        return mannschaftsname;
    }

    public void setgruppenbuchstabe(String s) {
        gruppenbuchstabe=s;
    }

    public void setMannschaftsname(String s) {
        mannschaftsname=s;
    }

    public void setPunkte(int p){
        punkte+=p;
    }

    public int getPunkte(){
        return punkte;
    }
}
