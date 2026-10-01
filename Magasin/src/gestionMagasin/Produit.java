package gestionMagasin;

public class Produit {
    private int id;
    private String nom;
    private float prix;
    private int quantité;


    public Produit(int id,String nom,  float prix, int quantité) {
        this.nom = nom;
        this.quantité = quantité;
        this.prix = prix;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public float getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public void afficherDetails(){
        System.out.println(
                "ID : " + getId() + "\n" + "Prix : " + getPrix() + "\n" + "Nom : " + getNom() + "\n" + "Quantité : " + getQuantité()
        );
    }
}
