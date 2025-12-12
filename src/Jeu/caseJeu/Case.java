package Jeu.caseJeu;

import Jeu.Oie;
import Jeu.caseJeu.piege.Piege;
import Jeu.caseJeu.teleportation.Pont;
import Jeu.caseJeu.teleportation.Teleportation;

public class Case {

    private int numCase;

    public Case(int numCase)
    {
        this.numCase = numCase;
    }

    public int getNum(){
        return numCase;
    }

    public String getNom(){return "Case n° "+numCase;}

    public Case depart(Oie oie){

    }

    protected Case caseSuivante(Oie oie, int numCaseDestination){

    }

    protected Case arrivee(Oie oie){

        Case caseArrivee = this;

        if( caseArrivee instanceof Piege ){
            ((Piege) caseArrivee).bloquer(oie);
        }

        if( caseArrivee instanceof Pont){
            ((Pont) caseArrivee).seTeleporter();
        }

        if( caseArrivee instanceof Pont){
            ((Pont) caseArrivee).seTeleporter();
        }


    }



}
