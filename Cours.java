package ecole;

public class Cours {
    private String intitule;
    private Enseignant enseignant;
    private Etudiant[] etudiants = new Etudiant[30];
    private int nbEtudiants = 0;

    public Cours(String intitule, Enseignant enseignant) {
        this.intitule = intitule;
        this.enseignant = enseignant;
    }

    public void inscrire(Etudiant e) {
        if (nbEtudiants < etudiants.length) {
            etudiants[nbEtudiants++] = e;
        }
    }

    public void afficherMeilleurEtudiant() {
        if (nbEtudiants == 0) {
            System.out.println("Aucun étudiant inscrit.");
            return;
        }
        Etudiant meilleur = etudiants[0];
        for (int i = 1; i < nbEtudiants; i++) {
            if (etudiants[i].calculeMoyenne() > meilleur.calculeMoyenne()) {
                meilleur = etudiants[i];
            }
        }
        System.out.println("Cours : " + intitule);
        System.out.println("Enseignant : " + enseignant.getnom());
        System.out.println("Meilleur étudiant : " + meilleur.getnom() + " "
                + meilleur.getprenom() + " (moyenne : " + meilleur.calculeMoyenne() + ")");
    }
   
}