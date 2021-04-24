package lambda;

// @FunctionalInterface -> Obriga a ter somente um metodo
// Uma Interface Funcional só pode ter um metodo
@FunctionalInterface
public interface Calculo {
	
	// Lambda vai usar o metodo abstrato
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	
}
