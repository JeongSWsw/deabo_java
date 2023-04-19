package ex07.io.data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException { // 예외처리 위임
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file); //예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true); //예외발생
		dos.writeChar(65); // ASCII code -> 'A'
		dos.writeShort(100);
		dos.writeInt(5500);
		dos.writeLong(8888888888L);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush();
		
		System.out.println("test.txt 파일에 "+ dos.size()+"byte save");
		
		dos.close();
	}
}
