public class UtilisateurReel extends Utilisateur {
    private String prenom;
    private String nom;
    private String email;

    public UtilisateurReel(String identifiant, String prenom, String nom, String email) {
        super(identifiant);
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

    @Override
    public String afficherInformations() {
        return "Identifiant: " + getIdentifiant() + ", Prénom: " + prenom + ", Nom: " + nom + ", Email: " + email;
    }
}