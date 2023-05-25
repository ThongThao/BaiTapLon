package Group;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Client.ClientUI;
import Client.TaoNhom;

import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;

public class Users extends JFrame {

	private static final Window JScorllPane = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users frame = new Users();
					frame.setVisible(true);
					frame.setTitle("Users");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Users() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10,243, 330, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Users");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(120, 10, 97, 48);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(61, 110, 70, 34);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBounds(129, 112, 115, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton ButtonFind = new JButton("");
		ButtonFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonFind.setForeground(new Color(255, 255, 255));
		ButtonFind.setBackground(new Color(0, 64, 128));
		ButtonFind.setIcon(new ImageIcon(Users.class.getResource("/Img/find (1).png")));
		ButtonFind.setBounds(254, 110, 47, 48);
		ButtonFind.setBorderPainted(false);
		contentPane.add(ButtonFind);
		ButtonFind.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton ButtonAdd = new JButton("");
		ButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonAdd.setForeground(new Color(0, 0, 0));
		ButtonAdd.setBackground(new Color(0, 64, 128));
		ButtonAdd.setIcon(new ImageIcon(Users.class.getResource("/Img/add (1).png")));
		ButtonAdd.setBounds(210, 10, 47, 48);
		ButtonAdd.setBorderPainted(false);
		contentPane.add(ButtonAdd);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Users.class.getResource("/Img/hr (1).png")));
		lblNewLabel_2.setBounds(49, 69, 264, 3);
		contentPane.add(lblNewLabel_2);
		
		JButton ButtonChat = new JButton("Chat");
		ButtonChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientUI chat = new ClientUI();
                chat.setVisible(true);
				dispose();
			}
		});
		ButtonChat.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonChat.setForeground(new Color(0, 0, 0));
		ButtonChat.setBounds(62, 176, 89, 47);
		contentPane.add(ButtonChat);
		
		JButton ButtonCGroup = new JButton("Group");
		ButtonCGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaoNhom taoNhomFrame = new TaoNhom();
                taoNhomFrame.setVisible(true);
				dispose();
		
			}
		});
		ButtonCGroup.setForeground(Color.BLACK);
		ButtonCGroup.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonCGroup.setBounds(195, 176, 97, 47);
		contentPane.add(ButtonCGroup);
		
		Object[][] data={};
		String[] column = {"ID","Name"};
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name"
			}
		));
		table.setBounds(10,10,420,348);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0,0,330,358);
		panel.add(scrollPane);
		
	}
}

