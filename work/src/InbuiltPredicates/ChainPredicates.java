package InbuiltPredicates;

import java.util.function.Predicate;

public class ChainPredicates {
	public static void main(String[] args) {
		Predicate<Integer> p1= i->i%2==0;
		Predicate<Integer> p2= i->i> 10;
		int[] arr= {15,14,22,7,18,5,2};
		
		System.out.println("if >10 AND even:");
		for(int i:arr) {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
				
			}
		}
		System.out.println("if >10 OR even:");
		for(int i:arr) {
			if(p1.or(p2).test(i)) {
				System.out.println(i);
				}
		}
	}
}
	
	
