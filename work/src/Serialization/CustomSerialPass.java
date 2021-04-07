package Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerialPass implements Serializable{
	String userName = "Yashas";
	transient String password = "hello world";

	private void writeObject(ObjectOutputStream oos) throws ClassNotFoundException,IOException{
		oos.writeUTF("123"+userName+","+"456"+password);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException {
		String[] unPwd = ois.readUTF().split(",");
		this.userName = unPwd[0].substring(3);
		this.password = unPwd[1].substring(3);
	}
	
	
}