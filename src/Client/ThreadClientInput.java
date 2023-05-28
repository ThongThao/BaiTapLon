package Client;

import java.io.DataInputStream;
import java.net.Socket;

public class ThreadClientInput extends Thread{
	private Socket client;

	public ThreadClientInput(Socket client) {
		this.client = client;
	}
	@Override
	public void run() {
		DataInputStream dis = null;
		try {
		    dis = new DataInputStream(client.getInputStream());
		    while(true) {
			String sms = dis.readUTF();
			System.out.println(sms);
		    }
		} catch (Exception e) {
			// TODO: handle exception
			try {
				dis.close();
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Ngat ket noi voi Server");
			}
		}
	}
}
