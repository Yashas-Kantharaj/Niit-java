package InbuiltPredicates.Operators;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
	public static void main(String[] args) {
		UnaryOperator<Integer> uo = i-> i*i;
		System.out.println(uo.apply(2));
		
		IntUnaryOperator iuo = i -> i*8;
		System.out.println(iuo.applyAsInt(5));
	}
}
