package Client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GetandSet.User;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

	private JPanel            contentPane;
	private JTextField        usernameField;
	private JPasswordField    passwordField;
	        JButton           ButtonLogin = new JButton("Login");
	        JButton           btnExit     = new JButton("Exit");
	        ArrayList<User>   listuser;

	/**
	 * Launch the application.
	 */
	public void Event() {
		ButtonLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				ClientUI client = new ClientUI();
				client.setVisible(true);
			}
			
		});
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(162, 10, 113, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 72, 82, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(29, 133, 82, 32);
		contentPane.add(lblNewLabel_1_1);
		
		usernameField = new JTextField();
		usernameField.setBounds(121, 69, 200, 37);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 133, 200, 37);
		contentPane.add(passwordField);
		
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonLogin.setBackground(new Color(192, 192, 192));
		ButtonLogin.setForeground(new Color(64, 0, 64));
		ButtonLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		ButtonLogin.setBounds(103, 195, 94, 49);
		ButtonLogin.setBorderPainted(false);
		contentPane.add(ButtonLogin);
		
		
		btnExit.setForeground(new Color(64, 0, 64));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnExit.setBorderPainted(false);
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(229, 195, 94, 49);
		contentPane.add(btnExit);
		
		Event();
	}
}
