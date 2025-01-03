public class Produit {
    private int id;
    private String nom;
    private String description;
    private int nombreEnStock;
    private String marque;
    private double prix;

    public Produit(int id, String nom, String description, int nombreEnStock, String marque, double prix) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", nombreEnStock=" + nombreEnStock +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}
