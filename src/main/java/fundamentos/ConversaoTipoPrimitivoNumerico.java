package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1.423408394284092384;
		System.out.println(a);
		
		// Convertendo Double -> Float com casting
		float b = (float) 1.423408394284092384; // Expl�cita (CAST)
		System.out.println(b);
		
		// Java n�o analisa valores e sim tipos
		// Int cabe mais que byte e por isso ele n�o cabe em byte
		// Pode ser usar o casting para convers�o
		// Se estourar o tamanho do byte vai perder informa��o
		int c = 4;
		byte d = (byte) c; // Expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // Expl�cita (CAST)
		System.out.println(f);
	}
}
