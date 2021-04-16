package assignments;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String s1 = "sale";
		String s2 = "seal";
		if(s1.length()==s2.length()) {
			char[] charArray1= s1.toCharArray();
			char[] charArray2= s2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			String res = Arrays.equals(charArray1,charArray2)? "is a anagram" : "is not a anagram";
			System.out.println(res);
		}
		else
			System.out.println("is not a anagram");
	}
}
