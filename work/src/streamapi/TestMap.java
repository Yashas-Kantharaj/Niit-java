package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		ArrayList<Integer> marks= new ArrayList<Integer>();
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		marks.add(35);
		System.out.println(marks);
		List<Integer> updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println( updatedmarks);
		List<Integer> evenno=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers="+ evenno);
		long count= marks.stream().filter(i->i<25).count();
		System.out.println("student less then 25: "+count);
		
		
	}
}
