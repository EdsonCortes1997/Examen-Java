package examenjava;

import java.util.Scanner;

public class PrimerEjercicio {
	
	public static void main(String[] args) {
		int numero;
		
		System.out.println("Escriba el numero para imprimirle su tabla basica");
		Scanner scan = new Scanner(System.in);
		
		numero = scan.nextInt();
		
		System.out.println(numero + " x "+ "1" + " = " + (numero));
		System.out.println(numero + " x "+ "2" + " = " + (numero*2));
		System.out.println(numero + " x "+ "3" + " = " +(numero*3));
		System.out.println(numero + " x "+ "4" + " = " +(numero*4));
		System.out.println(numero + " x "+ "5" + " = " +(numero*5));
		System.out.println(numero + " x "+ "6" + " = " +(numero*6));
		System.out.println(numero + " x "+ "7" + " = " +(numero*7));
		System.out.println(numero + " x "+ "8" + " = " +(numero*8));
		System.out.println(numero + " x "+ "9" + " = " +(numero*9));
		System.out.println(numero + " x "+ "10" + " = " +(numero*10));
		
	}
	
}
