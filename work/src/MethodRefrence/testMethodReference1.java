package MethodRefrence;

public class testMethodReference1 {
	 public static void main(String[] args) {
		MyInterface mi = testMethodReference1::m2;
		mi.method1(1, 2);
	}
	 public static void m2(int a,int b) {
		System.out.println("a="+a+"  b="+b);
	}
}
