package assignments;

public class NonRepeatChar {
	public static void main(String[] args) {
		String s = "yashas";
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
	}
}