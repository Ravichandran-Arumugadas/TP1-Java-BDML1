package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public void ajouterProduit(Produit produit){
        this.getProduits().add(produit);
    }

    public void supprimerProduit(Produit produit){
        this.getProduits().remove(produit);
    }

    public void afficherPanier() {
        for (int i = 0; i < produits.size(); i++) {
            produits.get(i).afficherDetails();
        }
    }

    public float calculerTotal(){
        float prixTotal = 0;
        for(int i=0; i < produits.size(); i++){
            float prixProduit = produits.get(i).getPrix();
            int quantite = produits.get(i).getQuantité();
            prixTotal = prixTotal + prixProduit * quantite;
        }
        return prixTotal;

    }
}
