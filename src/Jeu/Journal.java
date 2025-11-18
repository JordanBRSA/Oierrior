package Jeu;

public class Journal {

    private String message;

    public void ajouterMessage(String message) {
        this.message += message;
    }


    public void afficherMessage() {
        IO.println(this.message);
    }
}
