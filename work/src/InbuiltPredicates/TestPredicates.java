package InbuiltPredicates;

import java.util.function.Predicate;

public class TestPredicates {
	public static void main(String[] args) {
		Predicate<Integer> p=i -> i%2 == 0;
		System.out.println(p.test(5));
		System.out.println(p.test(10));
		
	}

}
