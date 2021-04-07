package collections;

import java.util.*;  
public class Deque1 {  
   public static void main(String[] args) {    
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("yashas");    
   deque.add("ramesh");     
   deque.add("pooja");    
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
} 