package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Testlimit {
	public static void main(String[] args) {
	
		ArrayList<Integer> marks= new ArrayList<Integer>();
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		marks.add(35);

		List<Integer> updatedmarks=marks.stream().limit(2).collect(Collectors.toList());
		System.out.println(updatedmarks);
}
}