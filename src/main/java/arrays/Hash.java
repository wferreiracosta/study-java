package arrays;

import java.util.HashSet;

import classe.Usuario;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Wesley"));
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		
		System.out.println(resultado);
	}
}
