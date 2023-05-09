import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public abstract class Login implements ActionListener {

	private static JLabel label1;
	protected static JTextField userText;
	private static JLabel passwordLabel;
	protected static JPasswordField passwordText;
	private static JButton button1;
	protected static JButton button2;
	private static JLabel success;
	protected static JLabel label2;
	protected static JTextField userText2;
	protected static JLabel passwordLabel2;
	protected static JLabel passwordLabel3;
	public static void main(String[] args) {
		
		JFrame frame1 = new JFrame("Login");
		JPanel panel1 = new JPanel();
		frame1.setSize(350,200);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.add(panel1);
	
		
		panel1.setVisible(true);
		
		panel1.setLayout(null);
		
		
		
		label1 = new JLabel("User");
		label1.setVisible(true);
		panel1.add(label1);
		label1.setBounds(10,20,80,25);
		
		
		 userText = new JTextField();
		userText.setBounds(100,20,165,25);
		panel1.add(userText);
		
		 passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel1.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel1.add(passwordText);
		
		 button1 = new JButton("Login");
		button1.setBounds(10,80,80,25);
		button1.addActionListener(new GUI1());
		panel1.add(button1);
		
		button2 = new JButton("SignUp");
		button2.setBounds(100,80,80,25);
		button2.addActionListener(new GUI());
		panel1.add(button2);
		
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel1.add(success);
	
		
		
		
		frame1.setVisible(true);
		
		
		
		
		
		
	}
	
		}
		

	
	
	





