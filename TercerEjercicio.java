package examenjava;

import java.util.Scanner;

public class TercerEjercicio {
	
	public static void main(String[] args) {
		String cadena;
		String cadenaInvertida = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese a la oracion o palabra a comprobar si es palindromo");
		cadena = scan.nextLine();
		
		
		for (int x=cadena.length()-1;x>=0;x--)
			cadenaInvertida = (String) (cadenaInvertida + cadena.charAt(x));
		
		if(cadena.equals(cadenaInvertida)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
	}

}
