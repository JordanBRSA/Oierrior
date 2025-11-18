package Jeu.caseJeu.teleportation;

import Jeu.caseJeu.Case;

public abstract class Teleportation extends Case {

    public Teleportation(int  numCase) {
        super(numCase);
    }
    public abstract void seTeleporter(Case prochaineCase);
}
