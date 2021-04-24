package fundamentos.variaveis;

public class Wrappers {
	public static void main(String[] args) {
		// O Java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos, um exemplo dele é o Integer, que é o Wrapper do tipo primitivo int.
		
		// byte
		Byte b = 1;
		
		// short
		Short s = 1000;
		
		// int
		Integer i = 10000;
		Integer i2 = Integer.parseInt("1000");
		
		// long
		// Só converter de Long para Long
		Long l = 1000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.floatValue());
		System.out.println(i.doubleValue());
		System.out.println(i);
		System.out.println(i2.toString());
		System.out.println(l.floatValue());
		
		// boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString());
		
		// char
		Character c = 'a';
		System.out.println(c.toString());
	}
}
