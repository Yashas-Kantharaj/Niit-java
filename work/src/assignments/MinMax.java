package assignments;

public class MinMax {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		  int max = a[0];  
	        for (int i = 0; i < a.length; i++) {  
	           if(a[i] > max)  
	               max = a[i];  
	        }  
	        int min = a[0];  
	        for (int i = 0; i < a.length; i++) {  
	           if(a[i] < min)  
	               min = a[i];  
	        }  
	        for (int element: a) {
	            System.out.print(element+" ");
	        }
	        System.out.println("\n"+max);
	        System.out.println(min);
	}
}
