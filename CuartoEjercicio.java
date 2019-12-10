package examenjava;

import java.util.Scanner;

public class CuartoEjercicio {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int[] j = new int[3];
	int[] k = new int[3];
	
	System.out.println("Teclea el primer numero del primer arreglo");
	j[0] = scan.nextInt();
	System.out.println("Teclea el segundo numero del primer arreglo");
	j[1] = scan.nextInt();
	System.out.println("Teclea el tercer numero del primer arreglo");
	j[2] = scan.nextInt();
	
	System.out.println("Teclea el primer numero del segundo arreglo");
	k[0] = scan.nextInt();
	System.out.println("Teclea el segundo numero del segundo arreglo");
	k[1] = scan.nextInt();
	System.out.println("Teclea el tercer numero del segundo arreglo");
	k[2] = scan.nextInt();

	System.out.println("El numero medio del primer arreglo es " + j[1]);
	System.out.println("El numero medio del segundo arreglo es " + k[1]);
	}
	
}