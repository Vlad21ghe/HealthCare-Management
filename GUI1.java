
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class GUI1 extends Login implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText.getText();
		
		//ADMIN
		
			
		if(user.equals("ADMIN") && password.equals("ADMIN")) {
				JOptionPane.showMessageDialog(null, "Login Successfull");
					
		}
		
		else
			{
			JOptionPane.showMessageDialog(null, "Username or Password are wrong");
				
		     
			}
				
		
		
		 if(e.getSource() == button2) {
			  
		 }
		
		
	}
}
	
		

