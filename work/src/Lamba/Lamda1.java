package Lamba;
import java.util.*;
import java.util.function.Function;
public class Lamda1 {
	public static void main(String[] args) {
//		int sq =squareIt(5);
//		System.out.println(sq);
		
		Function<Integer,Integer> f=n-> n*n;
		System.out.println("Sq Lamda function="+f.apply(4));
		
		FunctionalInterface s = (int a,int b)->a+b;
		System.out.println("Sum Lamda function="+s.Isum(4,4));
		
 	}

	private static int squareIt(int n) {	
		return n*n;
	}
}
