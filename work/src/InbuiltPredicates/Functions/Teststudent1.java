package InbuiltPredicates.Functions;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

import InbuiltPredicates.Student;


	public class Teststudent1 {
		public static void main(String[] args) {
			ArrayList<JavaStudent> javaStudents = TestJavaStudent.popstudents();
			BiPredicate<JavaStudent, JavaStudent> bp = (i,j) -> i.age > 18 && i.marks >60 ;
			Supplier<String> elgibility =() -> {
				String st="";
				for(JavaStudent s: javaStudents) {
					if( bp.test(s, s)) {
						st=st+s.name+"\n";
					
				}
				 
			}return st;
	};
	System.out.println(elgibility.get());
}
	}
