package generic;

public class testob {
	public static void main(String[] args) {
		gen<String> g1 = new gen<String>("yashas");
		g1.show();
		System.out.println(g1.getob());
		gen<Integer> g2 = new gen<Integer>(20);
		g2.show();
		System.out.println(g2.getob());
		
		gen<?> g3 = new gen<Integer>(new Integer(250));
		gen<? super String >g4 = new gen<Object>("hello");
		g3.show();
		g4.show();
		System.out.println(g3.getob());
		System.out.println(g4.getob());
	}
}
