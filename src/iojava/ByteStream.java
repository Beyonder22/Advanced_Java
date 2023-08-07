package iojava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream("source.txt");
			fileOutputStream = new FileOutputStream("dest.txt");
			int content;
			while((content = fileInputStream.read())!=-1) {
				fileOutputStream.write((byte)content);
			}
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			if(fileInputStream!=null) {
				fileInputStream.close();
			}
			if(fileOutputStream!=null) {
				fileOutputStream.close();
			}
		}
	}

}
