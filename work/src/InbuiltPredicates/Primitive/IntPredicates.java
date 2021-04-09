package InbuiltPredicates.Primitive;

import java.util.function.Predicate;
import java.util.function.IntPredicate;

public class IntPredicates {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 ==0 ;
		IntPredicate p = i -> i % 2 == 0;
		
		System.out.println(p.test(8));
	}
}
