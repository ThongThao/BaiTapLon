package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServerInput extends Thread{
	private Socket           socket;
	private DataInputStream  dis = null;
	private DataOutputStream dos = null;
	public ThreadServerInput(Socket socket) {
		    this.socket 	= socket;
		
		try {
			this.dis 		= new 	DataInputStream(socket.getInputStream());
			this.dos		= new  	DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			while(true) {
				String sms = dis.readUTF();
				if(sms.contains("exit")) {
					ServerUI.listsx.remove(socket);
					ServerUI.view.setText(ServerUI.view.getText()+"Da ngat ket noi voi socket ");
					dis.close();
					socket.close();
					continue;
				}
				for(Socket item : ServerUI.listsx) {
					if (item.getPort() != socket.getPort()) {
						DataOutputStream dos = new DataOutputStream(item.getOutputStream());
						dos.writeUTF(sms);
					}
				}
				dos.writeUTF(sms);
				System.out.println(sms);
			}
		} catch (Exception e) {
			// TODO: handle exception
			try {
				dos.close();
				dis.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
				ServerUI.view.setText("Ngat ket noi voi Server");
			}
		}
	}
}
