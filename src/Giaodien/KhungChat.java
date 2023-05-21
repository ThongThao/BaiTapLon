package Giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;

public class KhungChat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhungChat frame = new KhungChat();
					frame.setVisible(true);
			        frame.setTitle("Khung Chat");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KhungChat() {
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 676);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textArea_1.setBounds(29, 569, 388, 60);
		contentPane.add(textArea_1);
		
		JButton ButtonLink = new JButton("");
		ButtonLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonLink.setBackground(new Color(0, 64, 128));
		ButtonLink.setIcon(new ImageIcon(KhungChat.class.getResource("/Img/link (1).png")));
		ButtonLink.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonLink.setBounds(29, 517, 48, 42);
		ButtonLink.setBorderPainted(false);
		contentPane.add(ButtonLink);
		
		JButton ButtonSend = new JButton(new ImageIcon(KhungChat.class.getResource("/Img/send.png")));
		ButtonSend.setBackground(new Color(0, 64, 128));
		ButtonSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonSend.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonSend.setBounds(427, 569, 48, 49);
		ButtonSend.setBorderPainted(false);
		contentPane.add(ButtonSend);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(29, 86, 446, 418);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(KhungChat.class.getResource("/Img/hr (1).png")));
		lblNewLabel_2.setBounds(122, 60, 264, 3);
		contentPane.add(lblNewLabel_2);
	}
}