package Jeu;

import Jeu.caseJeu.Case;

public class Plateau {

    private static final int NB_CASES = 63;
    private final Case[] cases;

    public Plateau() {
        cases = new Case[NB_CASES];
        for (int i = 0; i < NB_CASES; i++) {
            cases[i] = new Case(i);
        }
    }

    public Case caseDebutPartie() {
        return cases[0];
    }
}
