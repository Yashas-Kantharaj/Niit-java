package collections;

import java.io.FileWriter;
import java.util.Properties;

public class createprop {
		public static void main(String[] args)throws Exception{  
	Properties p=new Properties();  
	p.setProperty("name","Yashas Kantharaj");  
	p.setProperty("email","Yashastkd@gmail.com");  
	p.store(new FileWriter("C:\\Users\\yasha\\git\\Niit-java\\work\\src\\collections\\info.properties"),"Javatpoint Properties Example");  
	  
	}  
}  

