import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MetierProduitImpl implements IMetier<Produit>{

    public List<Produit> produits;
    private  static int idCount =1;

    @Override
    public void add(Produit o) {
        Produit p = new Produit();
        p.setNom(o.getNom());
        p.setPrix(o.getPrix());
        p.setDescription(o.getDescription());
        p.setMarque(o.getMarque());
        p.setNombreEnStock(o.getNombreEnStock());
        p.setId(idCount++);
        produits.add(p);
    }

    @Override
    public List<Produit> getAll() {
        if (produits == null) {
            produits = new ArrayList<>(); // Ensure it's always initialized
        }
        return produits;
    }


    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    public Produit findByIdf(long id) {
        for (Produit p : produits) {
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for(int i =0; i<produits.size(); i++){
            if(produits.get(i).getId() == id){
                produits.remove(i);
                System.out.println("Produit deleted");
                return;
            }
        }

    }
}
