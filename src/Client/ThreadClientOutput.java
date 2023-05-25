package Client;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class ThreadClientOutput extends Thread{
	private Socket client;
	private String name;
	public ThreadClientOutput(Socket client, String name) {
		super();
		this.client = client;
		this.name 	= name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataOutputStream 	dos 	= null;
		Scanner 			sc 		= null;
		try {
			dos = new DataOutputStream(client.getOutputStream());
			sc 	= new Scanner(System.in);
			while(true) {
				String sms =  sc.nextLine();
				dos.writeUTF(name+": "+sms);
			}
		} catch (Exception e) {
			try {
				dos.close();
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Ngat ket noi voi Server");
			}
		}
	}
}
