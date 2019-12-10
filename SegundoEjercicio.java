package examenjava;

import java.util.Scanner;

public class SegundoEjercicio {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Ingrese el primer valor");
		a = scan.nextInt();
		System.out.println("Ingrese el segundo valor");
		b = scan.nextInt();
		
		if(a > 21 && b > 21 ) {
			System.out.println(0);
		}else if(a > b && a<= 21) {
			System.out.println(a);				
		}else if(a < b && b > 21){
				System.out.println(a);			
		}else if(b<=21) {
			System.out.println(b);
		}
	}
	

}
