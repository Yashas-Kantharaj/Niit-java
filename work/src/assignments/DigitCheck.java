package assignments;

public class DigitCheck {
	String s;
	void DigitCheck(String s) {
		this.s =s ;
		if(s.matches("[0-9]+")) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String dorsnt contain only digit");
	      }
	}
	
	
	
	public static void main(String[] args) {
		DigitCheck dc= new DigitCheck();
		dc.DigitCheck("yashas123");
		dc.DigitCheck("123");
		
	}
}
