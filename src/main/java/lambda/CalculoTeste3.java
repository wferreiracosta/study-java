package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		// int -> Double -> Não Permite
		// double -> Double -> Permite
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(1.0, 2.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(1.0, 2.0));
	}
}
