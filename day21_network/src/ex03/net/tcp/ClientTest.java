package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
	// Socket 1개 필요
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1",9000); // server ip & port number
			// I       /         O
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			String str = "안녕하세요... Server~";
			os.write(str.getBytes());
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
