
public class Medidas {
	private double espalda;
	private double pecho; 
	private double cintura;
	private double caderas;
	private String nombreusuario;



	public Medidas (double espalda, double pecho, double cintura, double caderas, String nombre){
		this.espalda = espalda;
		this.pecho = pecho;
		this.cintura = cintura;
		this.caderas = caderas;
		this.nombreusuario = nombre;

	}

	public void setNombre (String nombre) {
		this.nombreusuario=nombre;
	}
	
	public String getNombre () {
		return nombreusuario;
	}
	
	public void setEspalda(double espalda){
		this.espalda = espalda;
	}
	public double getEspalda () {
		return espalda;
	}
	
	
	public void setPecho(double pecho){
		this.pecho = pecho;
	}
	public double getPecho () {
		return pecho;
	}
	
	public void setCintura(double cintura){
		this.cintura = cintura;
	}
	public double getCintura () {
		return cintura;
	}

	
	public void setCaderas(double caderas){
		this.caderas = caderas;
	}
	public double getCaderas () {
		return caderas;
	}


}
