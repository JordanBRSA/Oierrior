package Jeu.caseJeu;

import Jeu.Oie;

public class Case {

    private int numCase;

    public Case(int numCase)
    {
        this.numCase = numCase;
    }

    public int getNum(){
        return numCase;
    }

    public Case depart(Oie oie){

    }

    protected Case arrivee(Oie oie){

    }

    protected Case suivante(Oie oie, int numCaseDestination){

    }

}
