
public class Tabladetalles {
	public int[][] talleSmall;
	public int[][] talleMedium;
	public int[][] talleLarge;

	

	public void setSmall (int minespalda, int maxespalda, int minpecho, int maxpecho) {

		
		int[] espalda; 
		espalda = new int[2];
		espalda[0] = minespalda;
		espalda[1] = maxespalda;
		
		int[] pecho; 
		pecho = new int[2];
		pecho[0] = minpecho;
		pecho[1] = maxpecho;
		
		int[][] talleSmall; 
		talleSmall = new int[2][2];	
		 talleSmall [0] = espalda;
		 talleSmall[1] = pecho;
		 this.talleSmall=talleSmall;
					 
	}
	
	public int[][] getSmall() {
		return talleSmall;
	}


	public void setMedium (int minespalda, int maxespalda, int minpecho, int maxpecho) {

		
		int[] espalda; 
		espalda = new int[2];
		espalda[0] = minespalda;
		espalda[1] = maxespalda;
		
		int[] pecho; 
		pecho = new int[2];
		pecho[0] = minpecho;
		pecho[1] = maxpecho;
		
		int[][] talleMedium; 
		talleMedium = new int[2][2];	
		 talleMedium [0] = espalda;
		 talleMedium[1] = pecho;
		 this.talleMedium=talleMedium;
					 
	}
	
	public int[][] getMedium() {
		return talleMedium;
	}

	public void setLarge (int minespalda, int maxespalda, int minpecho, int maxpecho) {

		
		int[] espalda; 
		espalda = new int[2];
		espalda[0] = minespalda;
		espalda[1] = maxespalda;
		
		int[] pecho; 
		pecho = new int[2];
		pecho[0] = minpecho;
		pecho[1] = maxpecho;
		
		int[][] talleLarge; 
		talleLarge = new int[2][2];	
		 talleLarge [0] = espalda;
		 talleLarge[1] = pecho;
		 this.talleLarge=talleLarge;
					 
	}
	
	public int[][] getLarge() {
		return talleLarge;
	}

}