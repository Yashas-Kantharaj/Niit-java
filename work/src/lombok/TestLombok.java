package lombok;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class TestLombok {
	public String example() {
	    val example = new ArrayList<String>();
	    example.add("Hello, World!");
	    val foo = example.get(0);
	    return foo.toLowerCase();
	  }
	  
	  public void example2() {
	    val map = new HashMap<Integer, String>();
	    map.put(0, "zero");
	    map.put(5, "five");
	    for (val entry : map.entrySet()) {
	      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
	    }
	  }
	  public static void main(String[] args) {
		TestLombok tl= new  TestLombok();
		val x=tl.example();
		tl.example2();
		System.out.println(x);
	}
}
