package Client;

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
import javax.swing.JTextField;

public class ClientUI extends JFrame {

	private JPanel      contentPane;
	private JTextField  tfName;

	/**
	 * Launch the application.
	 */
	public void Event() {
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientUI frame = new ClientUI();
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
	public ClientUI() {
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
		ButtonLink.setIcon(new ImageIcon(ClientUI.class.getResource("/Img/link (1).png")));
		ButtonLink.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonLink.setBounds(29, 517, 48, 42);
		ButtonLink.setBorderPainted(false);
		contentPane.add(ButtonLink);
		
		JButton ButtonSend = new JButton(new ImageIcon(ClientUI.class.getResource("/Img/send.png")));
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
		lblNewLabel_2.setIcon(new ImageIcon(ClientUI.class.getResource("/Img/hr (1).png")));
		lblNewLabel_2.setBounds(122, 60, 264, 3);
		contentPane.add(lblNewLabel_2);
		
		tfName = new JTextField();
		tfName.setBounds(181, 10, 138, 40);
		contentPane.add(tfName);
		tfName.setColumns(10);
		tfName.setEditable(false);

		
		JButton btnOut = new JButton("");
		btnOut.setBackground(new Color(0, 64, 128));
		btnOut.setBorderPainted(false);
		btnOut.setIcon(new ImageIcon(ClientUI.class.getResource("/Img/out (1).png")));
		btnOut.setBounds(416, 10, 58, 53);
		contentPane.add(btnOut);
	}
}
