package Serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialdemo {
	public static void main(String[] args) {
		Student student = new Student("Aman", 12);
		
		String filenameString = "test.txt";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		try {
			fileOut = new FileOutputStream(filenameString);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			System.out.print("Object serialized\n"+student);
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
