package Lamda.Anonymous;

public interface Interface1 {
	void m1();
	void m2();
	default void m3() {
		System.out.println("defualt");
	}
	public static void m4() {
		System.out.println("this is static method");
	}
}
