package ecole;

public class Etudiant extends Personne {
	private String matricule;
	private double [] notes= new double[20];
	private int nbnotes = 0;
	public Etudiant(String nom,String prenom, String email,String matricule) {
		super(nom, prenom, email);
		this.matricule=matricule;
		
	}
	
	public void ajouterNote(double n) {
		if( nbnotes < notes.length ) {
			notes[nbnotes]=n;
			nbnotes++;
		}
	}
	public double calculeMoyenne() {
		if(nbnotes == 0) {return 0.0;}
		double s=0;
		for(int i=0 ; i< nbnotes ;i++) {
			s += notes[i];
		}
		return (s/nbnotes);
	}
	@Override
	public String getRole() {return "etudiant ";}
	@Override
	public void afficherInfo() {
		super.afficherInfo();
		System.out.println("matricule="+matricule);
		System.out.println("moyenne="+ calculeMoyenne());
		
		
		
	}
	
	
		
}
