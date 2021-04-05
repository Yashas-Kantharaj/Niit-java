package ThreadSync;

class Bank{  
int amount=10000;  
  
synchronized void withdraw(int amount){  
System.out.println("going to withdraw...");  
  
if(this.amount<amount){  
System.out.println("Less balance; waiting for deposit...");  
try{wait();}catch(Exception e){}  
}  
this.amount-=amount;  
System.out.println("withdraw completed...");  
}  
  
synchronized void deposit(int amount){  
System.out.println("going to deposit...");  
this.amount+=amount;  
System.out.println("deposit completed... ");  
notify();  
}  
}  
  
class testsync{  
public static void main(String args[]){  
final Bank b=new Bank();  
new Thread(){  
public void run(){b.withdraw(15000);}  
}.start();  
new Thread(){  
public void run(){b.deposit(10000);}  
}.start();  
  
}}  