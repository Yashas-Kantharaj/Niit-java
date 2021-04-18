package assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	void remove(String s) {
		char carr[]= s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c:carr) {
			charSet.add(c);
		}
		StringBuilder sb= new StringBuilder();
		for (char c: charSet) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		
		
	}
	public static void main(String[] args) {
		RemoveDuplicates rd= new RemoveDuplicates();
		rd.remove("yashas");
		rd.remove("hello");
	}
}
