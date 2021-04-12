package MethodRefrence;

public class Test2 {
	public static void main(String[] args) {
	MyInterface sum= Myclass::MyAdd;
	sum.method1(10, 30);
	}
}
