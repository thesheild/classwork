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
	private ArrayList<String> user = new ArrayList<String>();
	private ArrayList<String> pass = new ArrayList<String>();
	
	Login(){
		//panel.setLayout(null);
		
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
		  register.setActionCommand("register");
		  login.setActionCommand("login");
		  register.addActionListener(this);
		  login.addActionListener(this);
		  
		  
		  setTitle("Register or Login");
		  
//		  Insets insets = panel.getInsets();
//	        Dimension size = register.getPreferredSize();
//	        register.setBounds(25 + insets.left, 5 + insets.top,
//	                     size.width, size.height);
		  
	  }
	public void actionPerformed(ActionEvent ae){
		user.add("john");
		pass.add("cena");
		user.add("daniel");
		pass.add("quinde");
		
		
		if("register".equals(ae.getActionCommand())){
			String v1=text1.getText();
			String v2=text2.getText();
			for (int i = 0; i<user.size();i++){
				if(!v1.equals(user.get(i))){
					user.add(v1);
					pass.add(v2);
					NextPage page=new NextPage();
					page.setVisible(true);
					JLabel label = new JLabel("Welcome:");
					page.getContentPane().add(label);
					break;
				}
				else{
					NextPage page=new NextPage();
					page.setVisible(true);
					JLabel label = new JLabel("Username has been taken.");
					page.getContentPane().add(label);
					break;
				}
			}
			
		}
		
		if("login".equals(ae.getActionCommand())){
			
			String value1=text1.getText();
			String value2=text2.getText();
			for(int i=0; i<user.size();i++){
				if (value1.equals(user.get(i)) && value2.equals(pass.get(i))) {
					NextPage page=new NextPage();
					page.setVisible(true);
					JLabel label = new JLabel("Welcome:"+value1);
					page.getContentPane().add(label);
					panel.dispose();
					
				}
//				else{
//					System.out.println("enter the valid username and password");
//				 	JOptionPane.showMessageDialog(this,"Incorrect login or password",
//				 			"Error",JOptionPane.ERROR_MESSAGE);
//				 	break;
				 	
//				}
			}
			
		}
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