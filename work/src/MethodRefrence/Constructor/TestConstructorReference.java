package MethodRefrence.Constructor;

public class TestConstructorReference {
	public static void main(String[] args) {
		ISample iSample = Sample::new;
		Sample s1 = iSample.get("yashas");
	}

}
