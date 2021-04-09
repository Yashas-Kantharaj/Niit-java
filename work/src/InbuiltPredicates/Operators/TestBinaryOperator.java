package InbuiltPredicates.Operators;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<String> bo = (s1,s2) -> s1+s2;
		System.out.println(bo.apply("hello ", " world"));
	}
}
