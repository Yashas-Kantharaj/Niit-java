package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialdemo1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		try {
			FileOutputStream fos = new FileOutputStream("dxc.txt");//serialization
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(d1);
		} catch (IOException e) {	
			e.printStackTrace();
		}

		FileInputStream fis;//de-serialization
		try {
			fis = new FileInputStream("dxc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d2 = (Dog)ois.readObject();
			System.out.println(d2.i +"\t"+ d2.j);

		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();
			} 
		catch (IOException e) {	
			e.printStackTrace();	
			} 
		catch (ClassNotFoundException e) {	
			e.printStackTrace();		
			}

	}

}
