
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GUI extends Login implements ActionListener{

    private static JLabel label;
    protected static JTextField userText;
    private static JLabel passwordLabel;
    protected static JPasswordField passwordText;
    protected static JTextField userText2;
    
    
    
    @SuppressWarnings("deprecation")
	@Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button2) {

            JFrame frame = new JFrame("Signup");

            JPanel panel = new JPanel();
            frame.setSize(350, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setVisible(true);

            panel.setLayout(null);

         
            // USER
            label = new JLabel("Username");
            label.setVisible(true);
            panel.add(label);
            label.setBounds(10, 20, 80, 25);

            userText = new JTextField();
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText);

            // PASSWORD
            passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(10, 50, 80, 25);
            panel.add(passwordLabel);

            passwordText = new JPasswordField();
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText);

            // VERIFY PASSWORD
            JLabel passwordLabel1 = new JLabel("Verify Password");
            passwordLabel1.setBounds(10, 80, 80, 25);
            panel.add(passwordLabel1);

            JPasswordField passwordText1 = new JPasswordField();
            passwordText1.setBounds(100, 80, 165, 25);
            panel.add(passwordText1);

            if(passwordText.getText().equals(passwordText1.getText())) {
                System.out.println("OK");
            }
            else {
                System.out.println("Passwords do not match");
            }

            // BIRTHDAY
            JLabel headerLabel = new JLabel("Select your birthday:");
            headerLabel.setBounds(10, 110, 150, 25);
            panel.add(headerLabel);

            String[] days = new String[31];
            for (int i = 0; i < 31; i++) {
                days[i] = Integer.toString(i+1);
            }
            JComboBox<String> dayList = new JComboBox<String>(days);
            dayList.setBounds(20, 140, 70, 25);
            panel.add(dayList);

            String[] months = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            JComboBox<String> monthList = new JComboBox<String>(months);
            monthList.setBounds(100, 140, 70, 25);
            panel.add(monthList);

            String[] years = new String[104];
            for (int i = 0; i < 104; i++) {
                years[i] = Integer.toString(1920+i);
            }
            JComboBox<String> yearList = new JComboBox<String>(years);
            yearList.setBounds(180, 140, 70, 25);
            panel.add(yearList);
            
         // PHONE NUMBER
            label = new JLabel("Phone num.");
            label.setVisible(true);
            panel.add(label);
            label.setBounds(10, 190, 80, 25);

            JTextField phoneText = new JTextField();
            phoneText.setBounds(100, 190, 165, 25);
            panel.add(phoneText);

            
            
            //GENDER
            label = new JLabel("Gender");
            label.setVisible(true);
            label.setBounds(10, 220, 80, 25);;
            panel.add(label);
            
            JRadioButton r1=new JRadioButton("Male");    
            JRadioButton r2=new JRadioButton("Female");    
            
            r1.setBounds(75,240,100,30);    
            r2.setBounds(75,270,100,30);   
            
           panel.add(r1);
           panel.add(r2);
            
           
           //SUBMIT BUTTIN
           JButton submit = new JButton("Submit");
           submit.setBounds(10,300,80,25);
   			panel.add(submit);
 
            
            frame.setVisible(true);
            
            
        }
    }

}

