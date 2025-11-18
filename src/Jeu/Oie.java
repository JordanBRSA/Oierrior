package Jeu;

import Jeu.caseJeu.Case;

public class Oie {

    private Couleur couleur;
    private Plateau plateau;
    private De de;
    private Case casePlateau;
    private Journal journal;

    public Oie(Couleur couleur,Plateau plateau,De de) {
        this.couleur = couleur;
        this.plateau = plateau;
        this.de = de;
    }

    public boolean action(){
        return true;
    }

    public int lancerDe(){
        return de.lancer();
    }

    public void ajouterMessage(String message){
        journal.ajouterMessage(message);
    }
}
