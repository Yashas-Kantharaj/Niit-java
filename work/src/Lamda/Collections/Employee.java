package Lamda.Collections;

	public class Employee {
		
		String name;
		int eid;
		
		public Employee(String string, int i) {
			name = string;
			eid = i;
		}
		
		@Override
		public String toString() {
			return eid +"-"+name;
		}
		

}


