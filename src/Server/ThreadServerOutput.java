package Server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ThreadServerOutput extends Thread{	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			String sms = sc.nextLine();
					
				try {
					for(Socket item : ServerUI.listsx) {
					dos = new  DataOutputStream(item.getOutputStream());
					dos.writeUTF("Server: "+sms);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		}
	}
}
