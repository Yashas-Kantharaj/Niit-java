package MethodRefrence.Constructor;

public class TestStudent {
	public static void main(String[] args) {
		Istudent is = Student::new;
		Student s1=is.get("yashas", 21, 212, 88);
	}
	

}
