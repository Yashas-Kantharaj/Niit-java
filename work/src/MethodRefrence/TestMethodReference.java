package MethodRefrence;

public class TestMethodReference {
	public static void main(String[] args) {
		Runnable r = TestMethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("in main thread");
		}
	}
	public static void m1() {
		for(int i=0;i<10;i++)
		{
			System.out.println("in m1 Method");
		}
	}

}
