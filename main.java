import java.util.Scanner;

public class main {
	public static void main (String[]args) {
		String username;
		double espalda;
		double pecho; 
		String talle = ".";
		Scanner scanner = new Scanner (System.in);
		
			Tabladetalles tabladetallesDeMiMarca = new Tabladetalles ();
			int minespalda = 39;
			int maxespalda = 40;
			int minpecho = 92;
			int maxpecho = 95;
			tabladetallesDeMiMarca.setSmall(minespalda, maxespalda, minpecho, maxpecho);
			
			minespalda = 41;
			maxespalda = 42;
			minpecho = 96;
			maxpecho = 100;
			tabladetallesDeMiMarca.setMedium(minespalda, maxespalda, minpecho, maxpecho);
			
			minespalda = 43;
			maxespalda = 44;
			minpecho = 101;
			maxpecho = 108;
			tabladetallesDeMiMarca.setLarge(minespalda, maxespalda, minpecho, maxpecho);
			
			
		Medidas medidasuser = new Medidas(0,0,0,0,null) ;
	
			
			System.out.println("Bienvenidx! Para empezar, decinos tu nombre.");
			username = scanner.nextLine();
			medidasuser.setNombre(username);
					
			System.out.println("Ingresá la medida de tu espalda en cm");
			espalda = scanner.nextDouble();
			medidasuser.setEspalda(espalda);
			
			System.out.println("Ingresá la medida de tu pecho en cm");
			pecho = scanner.nextDouble();
			medidasuser.setPecho(pecho);
			
			
			boolean continuar = true;
			while (continuar) {
				if ((espalda > tabladetallesDeMiMarca.talleLarge[0][1]) || (pecho > tabladetallesDeMiMarca.talleLarge[1][1]))
				{
					System.out.println(username + "Esta marca no tiene talles para vos! :C Dejá tu comentario o probá con otra!");
					continuar = false;			
				}
				
				 if (((espalda >= tabladetallesDeMiMarca.talleSmall[0][0]) && (espalda < tabladetallesDeMiMarca.talleSmall[0][1]))&& ((pecho >= tabladetallesDeMiMarca.talleSmall[1][0]) && (pecho < tabladetallesDeMiMarca.talleSmall[1][1]))) {
					talle =	"small";
					
								
				} else if (((espalda >= tabladetallesDeMiMarca.talleSmall[0][1]) && (espalda < tabladetallesDeMiMarca.talleMedium[0][1]))|| ((pecho > tabladetallesDeMiMarca.talleSmall[1][1]) && (pecho < tabladetallesDeMiMarca.talleMedium[1][1]))) {
					talle =	"medium";
			
				} else if (((espalda >= tabladetallesDeMiMarca.talleMedium[0][0]) && (espalda < tabladetallesDeMiMarca.talleMedium[0][1]))&& ((pecho >= tabladetallesDeMiMarca.talleMedium[1][0]) && (pecho < tabladetallesDeMiMarca.talleMedium[1][1]))) {
					talle =	"medium";
					
				} else if (((espalda >= tabladetallesDeMiMarca.talleMedium[0][1]) && (espalda < tabladetallesDeMiMarca.talleLarge[0][1]))|| ((pecho > tabladetallesDeMiMarca.talleMedium[1][1]) && (pecho < tabladetallesDeMiMarca.talleLarge[1][1]))) {
					talle =	"large";
					
				} else if (((espalda >= tabladetallesDeMiMarca.talleLarge[0][0]) && (espalda < tabladetallesDeMiMarca.talleLarge[0][1]))&& ((pecho >= tabladetallesDeMiMarca.talleLarge[1][0]) && (pecho < tabladetallesDeMiMarca.talleLarge[1][1]))) {
					talle =	"large";
					
				}
				 continuar = false;

			System.out.println(username +", tu talle en esta marca es " + talle + ".");
			
			}
		}
		
		
}


