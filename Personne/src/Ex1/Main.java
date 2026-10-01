package Ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de la classe Personne
        Personne personne1 = new Personne("Dupont", "Jean",2004);
        Personne personne2 = new Personne("Arumugadas", "Ravichandran",2004);
        Personne personne3 = new Personne("Neymar",2006);
        Personne personne4 = new Personne();


        System.out.println("Je m'appelle " + personne2.getNom() +" "+ personne2.getPrenom() + " et je suis né(e) en " + personne2.getAnNaissance());


        personne3.setNom("Da silva santos");
        personne3.setPrenom("Neymar JR");

        System.out.println("Je m'appelle " + personne3.getNom() +" "+ personne3.getPrenom() + " et je suis né(e) en " + personne3.getAnNaissance());


        System.out.println(personne4.getNom() + " " +  personne4.getPrenom() + " a " + personne4.calculerAge() + "ans");
        personne4.mange("Kebab");

        personne4.afficherInfos();

        personne2.afficherNbPers();


    }
}