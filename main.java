package ecole;

public class main {

	public static void main(String[] args) {
		 Etudiant e1 = new Etudiant("Diallo", "Aminata", "a.diallo@ecole.fr", "E001");
	        e1.ajouterNote(14);
	        e1.ajouterNote(16);
	        Etudiant e2 = new Etudiant("Martin", "Paul", "p.martin@ecole.fr", "E002");
	        e2.ajouterNote(10);
	        e2.ajouterNote(12);

	        Personne[] personnes = { e1, e2,
	           
	            new Enseignant("Durand", "Marie", "m.durand@ecole.fr", "Java", 40),
	            new Enseignant("Petit", "Luc", "l.petit@ecole.fr", "Maths", 35)
	        };

	        for (Personne p : personnes) {
	            p.afficherInfo();
	            System.out.println("\n");
	        }
	        Enseignant prof = new Enseignant("Durand", "Marie", "m.durand@ecole.fr", "Java", 40);
		    Cours cours = new Cours("Programmation Java", prof);
		    cours.inscrire(e1);
		    cours.inscrire(e2);
		    cours.afficherMeilleurEtudiant();
	}
	    }
	 
