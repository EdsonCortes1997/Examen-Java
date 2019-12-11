package EjerciciosExamen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeptimoEjercicio {

	public static void main(String[] args) {
		Map<String, String> name = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		name.put("a1234", "Steves Jobs");
		name.put("a1235", "Scott McNealy");
		name.put("a1236", "Jeff Bezos");
		name.put("a1237", "Larry Ellison");
		name.put("a1238", "Bill Gates");
		System.out.println("Ingrese el id");
		String id = scan.nextLine();
		FindKeyId(id, name);

	}

	private static void FindKeyId(String id, Map<String, String> name) {
		if (name.containsKey(id)) {
			System.out.println(id + " " + name.get(id));
		} else {
			System.out.println("No existe");
		}

	}
}
