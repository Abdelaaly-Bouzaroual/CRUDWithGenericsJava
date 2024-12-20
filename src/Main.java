import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");
            System.out.print("Votre choix: ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Liste des produits:");
                    List<Produit> produits = metier.getAll();
                    if (produits == null || produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        for (Produit produit : produits) {
                            System.out.println(produit);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'ID du produit: ");
                    long idRecherche = scanner.nextLong();
                    Produit produit = metier.findById(idRecherche);
                    if (produit != null) {
                        System.out.println("Produit trouvé: " + produit);
                    } else {
                        System.out.println("Aucun produit trouvé avec cet ID.");
                    }
                    break;

                case 3:
                    Produit nouveauProduit = new Produit();
                    System.out.print("Entrez le nom: ");
                    nouveauProduit.setNom(scanner.nextLine());
                    System.out.print("Entrez la marque: ");
                    nouveauProduit.setMarque(scanner.nextLine());
                    while (true) {
                        try {
                            System.out.print("Entrez le prix (un nombre): ");
                            nouveauProduit.setPrix(scanner.nextDouble());
                            break; // Exit loop if input is valid
                        } catch (InputMismatchException e) {
                            System.out.println("Entrée invalide. Veuillez entrer un nombre valide pour le prix.");
                            scanner.nextLine();
                        }
                    }
                    System.out.print("Entrez la description: ");
                    scanner.nextLine();
                    nouveauProduit.setDescription(scanner.nextLine());
                    while (true) {
                        try {
                            System.out.print("Entrez le nombre en stock (un nombre entier): ");
                            nouveauProduit.setNombreEnStock(scanner.nextInt());
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Entrée invalide. Veuillez entrer un nombre entier valide pour le stock.");
                            scanner.nextLine();
                        }
                    }
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès!");
                    break;

                case 4:
                    System.out.print("Entrez l'ID du produit à supprimer: ");
                    long idSuppression = scanner.nextLong();
                    metier.delete(idSuppression);
                    break;

                case 5:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }    }
}