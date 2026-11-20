package ga.esiitech.tp;

import com.google.gson.Gson;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product clavier = new Product("Clavier", 15000, 3);
        Product souris = new Product("Souris", 5000, 10);

        System.out.println(clavier);
        System.out.println("Valeur du stock : " + clavier.getStockValue() + " FCFA");
        System.out.println(souris);
        System.out.println("Valeur du stock : " + souris.getStockValue() + " FCFA");

        Gson gson = new Gson();
        String json = gson.toJson(clavier);
        System.out.println("En JSON : " + json);

        List<Product> produits = List.of(clavier, souris);
        int valeurTotale = 0;
        for (Product produit : produits) {
            valeurTotale += produit.getStockValue();
        }
        System.out.println("Valeur totale du stock : " + valeurTotale + " FCFA");
    }
}
