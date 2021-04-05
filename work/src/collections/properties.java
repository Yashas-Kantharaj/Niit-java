package collections;

import java.io.FileReader;
import java.util.Properties;

public class properties {
	
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("C:\\Users\\yasha\\git\\Niit-java\\work\\src\\collections\\db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
}  