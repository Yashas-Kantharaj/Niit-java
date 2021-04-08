package Lamba.Anonymous;

public interface Interface1 {
	void m1();
	void m2();
	default void m3() {
		System.out.println("defualt");
	}
}
