package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("yashas", 5000));
		elist.add(new Employee("ramesh", 4000));
		elist.add(new Employee("sandesh", 8000));
		elist.add(new Employee("ani", 3000));
		elist.add(new Employee("pooja", 7000));
		System.out.println(elist);
//		List<Employee> sortedlist= elist.stream().sorted().collect(Collectors.toList());
//		  System.out.println("sorted using name: "+sortedlist);
		
		Comparator<Employee> c = (e1,e2) -> {
			return(e1.salary<e2.salary)? -1
					:(e1.salary >e2.salary )? +1
							:0;
					
		};
		List<Employee> sortedlist1= elist.stream().sorted(c).collect(Collectors.toList());
		System.out.println("sorted using salary: "+sortedlist1);
		
		Employee minSalary = elist.stream().min((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println("Minimum salary: "+minSalary.toString());
		
		Employee maxSalary = elist.stream().max((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println("Maximum salary: "+maxSalary.toString());
		
	}
}
