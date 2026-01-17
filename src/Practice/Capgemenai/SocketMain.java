package Practice.Capgemenai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketMain {
	public static void main(String[] args) {
		try {
			ServerSocket servsocket=new ServerSocket(9999);
			Socket socket=servsocket.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message=in.readLine();
			System.out.println("Here is message::"+message);
			socket.close();
			servsocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
