public class Publication {
    private String identifiant;
    private String contenu;
    private String dateCreation;
    private Utilisateur auteur;
    private List<Utilisateur> utilisateursAssocies;

    public Publication(String identifiant, String contenu, String dateCreation, Utilisateur auteur) {
        this.identifiant = identifiant;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.auteur = auteur;
        this.utilisateursAssocies = new ArrayList<>();
    }

    public void ajouterUtilisateurAssocie(Utilisateur utilisateur) {
        utilisateursAssocies.add(utilisateur);
    }

    public void afficherInformations() {
        System.out.println("Publication ID: " + identifiant);
        System.out.println("Contenu: " + contenu);
        System.out.println("Date de création: " + dateCreation);
        System.out.println("Auteur: " + auteur.afficherInformations());
        System.out.println("Utilisateurs associés:");
        for (Utilisateur utilisateur : utilisateursAssocies) {
            System.out.println(" - " + utilisateur.afficherInformations());
        }
    }
}

