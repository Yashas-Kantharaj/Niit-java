package InbuiltPredicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestStudent {
	static public ArrayList<Student> st;
	
	public static void main(String[] args) {
		
		Populatestudents();
		Predicate<Student> s1 = (s) -> s.m1 + s.m2 + s.m3 >= 75;
		for(Student s : st) {
			if(s1.test(s)) {
				System.out.println(s.name);
			}
	}

}
	static void Populatestudents() {
		st = new ArrayList<Student>();
		st.add(new Student("yashas", 30, 25, 21));
		st.add(new Student("sandesh", 25, 28, 25));
		st.add(new Student("Ramesh", 18, 20, 21));
		st.add(new Student("siju", 24, 25, 18));
		st.add(new Student("pooja", 30, 25, 24));
		st.add(new Student("ani", 12, 25, 21));
	}
}
