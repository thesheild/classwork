import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
 
class Login extends JFrame implements ActionListener {
	JButton register;
	JButton login;
	JPanel panel;
	JLabel label1,label2;
	final JTextField  text1,text2;
	private ArrayList<String> users = new ArrayList<String>();
	
	Login(){
		label1 = new JLabel();
		label1.setText("Username:");
		text1 = new JTextField(15);
		
		label2 = new JLabel();
		label2.setText("Password:");
		text2 = new JPasswordField(15);
		 
		  register=new JButton("Register");
		  login = new JButton("Login");
		  
		  panel=new JPanel(new GridLayout(3,1));
		  panel.add(label1);
		  panel.add(text1);
		  panel.add(label2);
		  panel.add(text2);
		  panel.add(register);
		  panel.add(login);
		  
		  add(panel,BorderLayout.CENTER);
		  register.addActionListener(this);
		  login.addActionListener(this);
		  //change the action of register
		  setTitle("Register or Login");
		  
		  
		  
	  }
	public void actionPerformed(ActionEvent ae){
		//ArrayList<String> users = new ArrayList<String>();
		users.add("aj");
		  String value1=text1.getText();
		  String value2=text2.getText();
		  if (value1.equals(users.get(0)) && value2.equals("aj")) {
			  NextPage page=new NextPage();
			  page.setVisible(true);
			  JLabel label = new JLabel("Welcome:"+value1);
			  page.getContentPane().add(label);
		  }
		  else{
			  System.out.println("enter the valid username and password");
			  JOptionPane.showMessageDialog(this,"Incorrect login or password",
			  "Error",JOptionPane.ERROR_MESSAGE);
		  }
		}
	public void actionPerformed2(ActionEvent ae){
		String value1=text1.getText();
		//String value2=text2.getText();
		users.add(value1);
	}
}

	class LoginDemo{
	  public static void main(String arg[]){
		  
		  
	  try{
		  Login frame=new Login();
		  frame.setSize(500,500);
		  frame.setVisible(true);
	  }
	  catch(Exception e){
		  JOptionPane.showMessageDialog(null, e.getMessage());}
	  }
}