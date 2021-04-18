package assignments;

public class PalindromeCheck {
	void checker(String s) {
		StringBuffer sb= new StringBuffer(s);
		if(s.equals(sb.reverse().toString())) 
			System.out.println("Its a palindrome");
		else
			System.out.println("Its not a palindrome");
	}
	public static void main(String[] args) {
		PalindromeCheck p=new PalindromeCheck();
		p.checker("yashas");
		p.checker("appa");
				

	}
}
