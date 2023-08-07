package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class niotrial {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("niosource.txt");
		FileChannel readChannel = fin.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate(1024);
		int result = readChannel.read(readBuffer);
		System.out.println("file read successfully "+result);
		
		FileOutputStream fout = new FileOutputStream("niodest.txt");
		FileChannel writeChannel = fout.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
		String message = "ankush sdjias asd";
		writeBuffer.put(message.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.print("file written succesfully");
	}
}
