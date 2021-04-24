package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1.423408394284092384;
		System.out.println(a);
		
		// Convertendo Double -> Float com casting
		float b = (float) 1.423408394284092384; // Explícita (CAST)
		System.out.println(b);
		
		// Java não analisa valores e sim tipos
		// Int cabe mais que byte e por isso ele não cabe em byte
		// Pode ser usar o casting para conversão
		// Se estourar o tamanho do byte vai perder informação
		int c = 4;
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);
	}
}
