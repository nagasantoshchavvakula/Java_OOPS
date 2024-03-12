package SerializationAndDeserialization;

import java.io.*;

public class SerializationClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		emp.name="Chandu";
		emp.address="Plano,Texas";
		
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\91900\\SerializationAndDeserialization.txt");
			ObjectOutputStream Out = new ObjectOutputStream(fileOut);
			Out.writeObject(emp);
			Out.close();
			fileOut.close();
			System.out.println("Serializaton is Succeeded");
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
