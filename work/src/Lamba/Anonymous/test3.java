package Lamba.Anonymous;

public class test3 {
public static void main(String[] args) {
	Interface1 interface1 = new Interface1() {
		
		@Override
		public void m2() {
			System.out.println("m2-- interface");
		}
		
		@Override
		public void m1() {
			System.out.println("m1-- interface");
			
		}
	};
	
	interface1.m1();
	interface1.m2();
	interface1.m3();
	}
}

