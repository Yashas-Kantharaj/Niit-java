package InbuiltPredicates.Functions;

import java.util.ArrayList;
import java.util.function.Function;

public class TestJavaStudent {
	
	static ArrayList<JavaStudent> js;
	
	public static void main(String[] args) {
		popstudents();
		Function<JavaStudent,String> f =(j) -> {
			if(j.marks>80) return "distinction";
			else if (j.marks>60) return "first class";
			return "pass";
			
		};
		
		for(JavaStudent s : js) {	
			System.out.println(s.name +"\t"+ f.apply(s));
		}
	}
	
	public static ArrayList<JavaStudent> popstudents() {
		js = new ArrayList<JavaStudent>();
		js.add(new JavaStudent("yashas",70,22));
		js.add(new JavaStudent("ram",60,18));
		js.add(new JavaStudent("pooja",75,22));
		js.add(new JavaStudent("salman",90,18));
		return js;
	
	}
}
