package Giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrangUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangUsers frame = new TrangUsers();
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
	public TrangUsers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 162, 440, 368);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Users");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(188, 10, 97, 48);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(106, 109, 70, 34);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBounds(186, 112, 115, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton ButtonFind = new JButton("");
		ButtonFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonFind.setForeground(new Color(255, 255, 255));
		ButtonFind.setBackground(new Color(0, 64, 128));
		ButtonFind.setIcon(new ImageIcon(TrangUsers.class.getResource("/Img/find (1).png")));
		ButtonFind.setBounds(311, 108, 47, 48);
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
		ButtonAdd.setIcon(new ImageIcon(TrangUsers.class.getResource("/Img/add (1).png")));
		ButtonAdd.setBounds(277, 10, 47, 48);
		ButtonAdd.setBorderPainted(false);
		contentPane.add(ButtonAdd);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(TrangUsers.class.getResource("/Img/hr (1).png")));
		lblNewLabel_2.setBounds(94, 68, 264, 3);
		contentPane.add(lblNewLabel_2);
	}
}
