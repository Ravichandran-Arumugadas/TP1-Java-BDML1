package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {

    private List<Produit> produits;

    public Magasin() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        for (int i = 0; i < produits.size(); i++) {
            produits.get(i).afficherDetails();
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getNom().equals(nom)) {
                return produits.get(i);
            }
        }

        return null;
    }
}

