package InbuiltPredicates.Functions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	static ArrayList<JavaStudent> js= TestJavaStudent.popstudents();
	public static void main(String[] args) {
		Consumer<JavaStudent> c= s ->  System.out.println(s.name);
		for(JavaStudent s : js) {
			c.accept(s);
			
		}
	}
}
