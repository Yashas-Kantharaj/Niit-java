package InbuiltPredicates.Functions;

import java.util.function.Function;

public class TestFunctions {
	public static void main(String[] args) {
		Function<Integer,Integer>f = i-> i*i;
		System.out.println(f.apply(4));

		Function<String,Integer> f2 = s -> s.length();
		System.out.println("length of yashas="+f2.apply("yashas"));
		
		Function<String,String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("yashas"));
		
	}
}
