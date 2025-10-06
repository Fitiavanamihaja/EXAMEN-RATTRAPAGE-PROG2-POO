public class UtilisateurAnonyme extends Utilisateur {
    public UtilisateurAnonyme(String identifiant) {
        super(identifiant);
    }

    @Override
    public String afficherInformations() {
        return "Utilisateur anonyme avec identifiant: " + getIdentifiant();
    }
}