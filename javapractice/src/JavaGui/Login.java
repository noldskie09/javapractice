package JavaGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener{
	String user =" hatdog123";
	String pass="admin";
	JFrame frame;
	JTextField textfield1;
	JTextField textfield2;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	
	JLabel label1;
	JLabel label2;
	
	JButton button1;
	JButton button2;
	
	public Login(){
		frame = new JFrame("Log in");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
	
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 400, 50); //position
		panel1.setBackground(Color.black); //color
		
		label1 = new JLabel();
		label1.setText("username");
		label1.setForeground(Color.green);
		label1.setBackground(Color.black);
		label1.setOpaque(true);
		
		textfield1 = new JTextField();
		textfield1.setBounds(100,50,200,50);
		
		textfield2 = new JTextField();
		textfield2.setBounds(100,100,200,50);
		
		
		button1 = new JButton("Log in");
		button1.setBounds(100,200,200,50);
		button1.setFocusable(false);
		
		
		frame.add(panel1);
		frame.add(label1);
		frame.add(textfield1);
		frame.add(textfield2);
		frame.add(button1);
			
	}
	
	void textclear() {
		textfield1.setText("");
		textfield2.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			if(textfield1.equals(user) && textfield2.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Log in Succesfully");
				textclear();
				
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect username or password");
				textclear();
			}
		
	}

	}
}
