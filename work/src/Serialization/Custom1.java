  
package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Custom1 {
	public static void main(String[] args) throws Exception{
		CustomSerialPass account = new CustomSerialPass();
		
		FileOutputStream fos = new FileOutputStream("account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		
		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomSerialPass account2 = (CustomSerialPass) ois.readObject();
		System.out.println("username = "+account2.userName+" password= "+account2.password);
		
	}

}