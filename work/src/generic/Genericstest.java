package generic;

import java.util.ArrayList;

public class Genericstest {
	public static void main(String[] args)
    {
               ArrayList<String> al = new ArrayList<String>();
  
        al.add("Sachin");
        al.add("Rahul");
        //al.add(10); / 
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
  
        //String s3 = (String)al.get(2);
        System.out.println(al);
    }

}
