package javapractice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener {
	JPanel panel;
	JPanel panel1;
	JButton button;
	JButton button1;
	TextField textfield;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,550);
		this.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0,0,50,10);
		panel.setBackground(Color.black);
		
	
		panel1 = new JPanel();
		panel1.setBounds(100,80,50,50);
		panel1.setBackground(Color.red);
		
		textfield = new TextField();
		textfield.setText("Game Over");
		textfield.setBounds(100,250,170,50);
		textfield.setForeground(Color.green);
		textfield.setFont(new Font("Arial", Font.BOLD, 30));
		textfield.setBackground(Color.black);
		
		button = new JButton();
		button.setText("Dark");
		button.setBounds(100,150,100,50);
		button.setBackground(Color.black);
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setForeground(Color.green);
		button.setFocusable(false);
		
		button1 = new JButton();
		button1.setText("White");
		button1.setBounds(100,200,100,50);
		button1.setBackground(Color.black);
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setForeground(Color.green);
		button.setFocusable(false);
		
		this.add(panel);
		this.add(button);
		this.add(button1);
		this.add(panel1);
		
		this.addKeyListener(this);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		switch(e.getKeyChar()) {
		case 'w':
			panel.setLocation(panel.getX(), panel.getY()-10);
			break;
		case 's':
			panel.setLocation(panel.getX(), panel.getY()+10);
			break;
		case 'a':
			panel.setLocation(panel.getX()-10, panel.getY());
			break;
		case 'd':
			panel.setLocation(panel.getX()+10, panel.getY());
			break;
		
		}
		
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
