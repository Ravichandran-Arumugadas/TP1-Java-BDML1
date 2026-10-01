package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private int idCommande;
    private Client client;
    private Panier produitsCommandes;
    private float total;

    public Commande(int idCommande, Client client, Panier produitsCommandes, float total) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = produitsCommandes;
        this.total = produitsCommandes.calculerTotal();
    }

    public void afficherDetailsCommande(){
        System.out.println("Numéro de commande : " + this.idCommande);
        this.client.afficherDetails();
        this.produitsCommandes.afficherPanier();
        System.out.println("Le montant total est de : " + this.total);

    }


}
