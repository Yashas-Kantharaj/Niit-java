package collections;

import java.util.HashMap;
import java.util.Map;

public class map1 {
	 public static void main(String args[]){  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Raghu");  
	  map.put(101,"Rajesh");  
	  map.put(102,"Rahul");   
	  for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}  
