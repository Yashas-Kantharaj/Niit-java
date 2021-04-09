package InbuiltPredicates.Functions;

import java.util.function.Function;

public class TestFunctions {
	public static void main(String[] args) {
		Function<Integer,Integer>f = i-> i*i;
		System.out.println(f.apply(4));

		
	}
}
