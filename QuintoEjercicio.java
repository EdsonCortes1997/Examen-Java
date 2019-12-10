package EjerciciosConect;
import java.util.Scanner;

import examenjava.JavaExamen;

public class QuintoEjercicio implements JavaExamen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer numero");
		num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = scan.nextInt();
		
		System.out.println("Suma " + JavaExamen.suma(num1, num2));
		System.out.println("Resta " + JavaExamen.resta(num1, num2));
		System.out.println("Multiplicacion " + JavaExamen.multiplicacion(num1, num2));
		System.out.println("Division " + JavaExamen.division(num1, num2));
	}
}
