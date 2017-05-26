

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ButtonDemo extends JPanel
implements ActionListener {
protected static JButton b1;
protected static JButton b2;
protected static JButton b3;

public ButtonDemo() {

//JPanel bu1 = new JPanel();
//bu1.add(b1);
//this.add(bu1);


b1 = new JButton("Disable middle button");
b1.setVerticalTextPosition(AbstractButton.CENTER);
b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
b1.setMnemonic(KeyEvent.VK_D);
b1.setActionCommand("disable");

b2 = new JButton("Middle button");
b2.setVerticalTextPosition(AbstractButton.BOTTOM);
b2.setHorizontalTextPosition(AbstractButton.CENTER);
b2.setMnemonic(KeyEvent.VK_M);

b3 = new JButton("Enable middle button");
//Use the default text position of CENTER, TRAILING (RIGHT).
b3.setMnemonic(KeyEvent.VK_E);
b3.setActionCommand("enable");
b3.setEnabled(false);

//Listen for actions on buttons 1 and 3.
b1.addActionListener(this);
b3.addActionListener(this);

b1.setToolTipText("Click this button to disable the middle button.");
b2.setToolTipText("This middle button does nothing when you click it.");
b3.setToolTipText("Click this button to enable the middle button.");

//Add Components to this container, using the default FlowLayout.
add(b1);
add(b2);
add(b3);

//b1.setLayout(new BorderLayout());
//b1.add(bu1,BorderLayout.SOUTH);

}

public void actionPerformed(ActionEvent e) {
if ("disable".equals(e.getActionCommand())) {
b2.setEnabled(false);
b1.setEnabled(false);
b3.setEnabled(true);
} else {
b2.setEnabled(true);
b1.setEnabled(true);
b3.setEnabled(false);
}
}

/**
* Create the GUI and show it.  For thread safety, 
* this method should be invoked from the 
* event-dispatching thread.
*/
private static void createAndShowGUI() {

//Create and set up the window.
JFrame frame = new JFrame("ButtonDemo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Create and set up the content pane.
ButtonDemo newContentPane = new ButtonDemo();
newContentPane.setOpaque(true); //content panes must be opaque
frame.setContentPane(newContentPane);

//frame.add(b1, BorderLayout.PAGE_START); 
//frame.add(b2, BorderLayout.WEST); 
//frame.add(b3, BorderLayout.PAGE_END); 


//Display the window.
frame.setSize(800,800);
frame.setVisible(true);


}

public static void main(String[] args) {
//Schedule a job for the event-dispatching thread:
//creating and showing this application's GUI.
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
createAndShowGUI(); 
}
});
}
}