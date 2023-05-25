package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ServerUI extends JFrame {
	public static 	ArrayList<Socket> 	listsx;
	public JPanel contentPane;
	JTextField inputPort;
	JButton btnStart = new JButton("Start Server");
	public static JTextArea view = new JTextArea();
	/**
	 * Launch the application.
	 */
	
	public void Event() {
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					execute();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			private void execute() throws IOException {
				ServerSocket server 	= new ServerSocket(Integer.parseInt(inputPort.getText()));
				ThreadServerOutput out  		= new ThreadServerOutput();
				out.start();
				System.out.println("Server is listening....");
				while(true) {
					Socket socket 	= server.accept();
					view.setText(view.getText()+"Connected with" + socket);
					listsx.add(socket);
					ThreadServerInput in = new ThreadServerInput(socket);
					in.start();
				}
			}
		});
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerUI frame = new ServerUI();
					
					frame.setVisible(true);
					frame.setTitle("Server");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ServerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Port:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(126, 28, 79, 32);
		contentPane.add(lblNewLabel);
		
		inputPort = new JTextField();
		inputPort.setBounds(192, 32, 132, 34);
		contentPane.add(inputPort);
		inputPort.setColumns(10);
		
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(192, 106, 122, 32);
		contentPane.add(btnStart);
		
		view.setBackground(new Color(255, 255, 255));
		view.setBounds(10, 148, 498, 316);
		contentPane.add(view);
		view.setLayout(null);
		
		Event();
	}
}
