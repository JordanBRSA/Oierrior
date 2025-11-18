package Test;

import Jeu.Couleur;
import Jeu.JeuOie;

public class Test01 {
    public static void main(String[] argv){
        JeuOie jeuOie = new JeuOie(3);
        jeuOie.ajouterOie(Couleur.VERTE);
        jeuOie.ajouterOie(Couleur.JAUNE);
        jeuOie.ajouterOie(Couleur.BLEU);
        jeuOie.jouer();
    }
}
