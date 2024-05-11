package formation;

public class voiture {
	
	String marque;
	public String getMarque() { return marque; }
	public void setMarque(String marque) {
        this.marque=marque;
    }
	
	String VIN;
	public String getVin() { return VIN; }
	
	String couleur;
	public String getCouleur() { return couleur; }
	
	int nombrePorte;
	public int getNombrePorte() { return nombrePorte; }
	
	
	 public voiture(String marque,String VIN,String couleur,int nombrePorte)
  {
      this.marque=marque;
      this.VIN=VIN;
      this.couleur=couleur;
      this.nombrePorte=nombrePorte;
  }
	 @Override
	    public String toString() {
	        return this.marque+' '+this.couleur+' '+this.VIN+' '+this.nombrePorte;
	    }
	  
}
