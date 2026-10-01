package Ex1;

public class Personne {

    private String nom;
    private String prenom;
    private int anNaissance;
    private static int nbPers = 0;


    public Personne(String nom,String prenom,int anNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPers++;
        afficherNbPers();
    }

    public Personne(String prenom,int anNaissance){
        this.nom = "Inconnu";
        this.prenom=prenom;
        this.anNaissance=anNaissance;

        nbPers++;
        afficherNbPers();

    }

    public Personne(){
        this.nom = "Potter";
        this.prenom= "Harry";
        this.anNaissance= 1980;
        nbPers++;
        afficherNbPers();

    }

    public String getNom() {
        return nom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int calculerAge(){
        //utliser local data pour pouvoir utiliser l'annéee actuelle
        return 2026 - getAnNaissance();
    }

    public void afficherInfos() {
        System.out.println(
                "Nom : " + getNom() + "\n" + "Prénom : " + getPrenom() + "\n" + "Année de naissance : " + getAnNaissance()
        );
    }

    public void mange(String aliment) {
        System.out.println(getNom() + " " + getPrenom() + " mange un/une " + aliment);
    }

    public void afficherNbPers(){
        System.out.println("Nombre de personnes : " +  nbPers);
    }



}
