package generic;

public class gen<T> {
	T ob;
	
	public gen(T ob) {
		this.ob =ob;
	
	}
	
	public void show() {
		System.out.println("the type of this class is"+ob.getClass().getName());
		
	}
	public T getob() {
		return ob;
	}
	


}
