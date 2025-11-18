package Jeu.caseJeu.piege;

import Jeu.Oie;
import Jeu.caseJeu.Case;

public abstract class Piege extends Case {

    public Piege(int numCase) {
        super(numCase);
    }
    public abstract void bloquer(Oie uneOie, int nbTour);
}
