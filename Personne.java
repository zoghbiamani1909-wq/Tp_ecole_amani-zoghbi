package ecole;

public  abstract class Personne {
	private  String nom;
	private String prenom;
	private String email;
	
	public Personne(String nom,String prenom, String email) {
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
	}
	public String getnom() {
		return this.nom;
	}
	public String getprenom() {
		return this.prenom;
	}
	public String getemail() {
		return this.email;
	}
	public abstract String getRole();
	public void afficherInfo() {
		System.out.println("le role est "+ getRole() +"\n le non: "+ nom+"\n le prenom: "+ prenom);
		
	}

}
