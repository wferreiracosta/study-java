package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//put adicionado caso não exista e caso exista ele altera
		usuarios.put(1, "Rodrigo"); // Adicioncar chave(id) e valor
		System.out.println(usuarios.get(1));
		
		usuarios.put(1, "Ricardo");
		System.out.println(usuarios.get(1));
		
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Pedro");
		usuarios.put(5, "Carlos");
		
		System.out.println(usuarios.keySet()); // Chaves no map
		System.out.println(usuarios.values()); // Valores no map
		System.out.println(usuarios.entrySet()); // Chave e Valor
		
		System.out.println(usuarios.containsKey(1)); // Verifica se a chave está no map
		System.out.println(usuarios.containsKey(10));
		
		System.out.println(usuarios.containsValue("Pedro")); // Verifica se o valor está no map
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println(usuarios.remove(1)); // Remove pela chave
		System.out.println(usuarios.remove(2, "Rafaela")); // Remove pela chave e valor
		System.out.println(usuarios.remove(10, "Rafaela")); // Vai dar errodo porque o valor e chave não batem
		
		System.out.println(usuarios);
	}
}
