package Lamda.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("yashas",212));
		employees.add(new Employee("yashaswini",213));
		employees.add(new Employee("salman",162));
		employees.add(new Employee("sandesh",167));
		employees.add(new Employee("pooja",211));
		
		System.out.println(employees);
		Comparator<Employee> a = (e1,e2)->(e1.eid < e2.eid)? -1 : (e1.eid > e2.eid)? 1 : 0;
		Collections.sort(employees,a);
		System.out.println(employees);
		
	}
}
