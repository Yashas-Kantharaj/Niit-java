package work;

public class testthrow{  
	   static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){ 
		   try {
	      validate(16);
		   }
		   catch (ArithmeticException e) {
			   System.out.println("should be above 18");
		   }
	      System.out.println("rest of the code...");  
	  }  
	}  