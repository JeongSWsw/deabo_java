package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException{
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		
		for(int i = 0 ; i <= 10; i++) {
			raf.seek(i*100);
//			raf.writeInt(i);
			String str = "hello";
			raf.writeUTF(str);
		}
		for(int i = 0 ; i <= 10; i++) {
			raf.seek(i*100);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string print success");
		raf.close();
		
	}
}
