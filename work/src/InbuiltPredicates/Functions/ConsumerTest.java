package InbuiltPredicates.Functions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<JavaStudent> js= TestJavaStudent.popstudents();
	public static void main(String[] args) {
		Predicate<JavaStudent> p = s -> s.marks >=65;
		
		Consumer<JavaStudent> c= s ->  System.out.println(s.name);
		System.out.println("Student who are more than 65 :");
		for(JavaStudent s : js) {
			if(p.test(s))
				c.accept(s);
			
		}
	}
}
