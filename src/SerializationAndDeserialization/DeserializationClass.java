package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Emp emp = null;
		try {
			
			FileInputStream fileIn=new FileInputStream("C:\\Users\\91900\\SerializationAndDeserialization.txt");
			ObjectInputStream In= new ObjectInputStream(fileIn);
			emp = (Emp) In.readObject();
			In.close();
			fileIn.close();
		}finally{
			System.out.println("Deserialization Employee.....");
			System.out.println("First Name is:"+emp.name);
			System.out.println("Address is:"+emp.address);
		}
	}

}
