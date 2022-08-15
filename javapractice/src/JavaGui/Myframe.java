package JavaGui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Myframe extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	
	Font font = new Font("MV Boli",Font.PLAIN | Font.ITALIC,30);
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	JPanel panel1;
	JPanel panel2;
	JPanel panel3 ;
	JPanel panel4 ;
	JPanel panel5 ;
	JLabel label1;
	
	JButton button[] = new JButton[5];
	JButton button1;
	JButton button2;

	
	Myframe(){
		ImageIcon icon1 = new ImageIcon("dark.png");
		ImageIcon icon2 = new ImageIcon("light.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 800, 50); //position
		panel1.setBackground(Color.black); //color
	//panel1.setLayout(new BorderLayout()); // use border layout to use horizontal and vertical in label
		panel1.setBorder(border);
		
		
		
		panel2 = new JPanel();
		panel2.setBounds(0, 50, 100, 500);
		panel2.setBackground(Color.red);
		panel2.setLayout(new BorderLayout());
		
		panel3 = new JPanel();
		panel3.setBounds(0, 500, 800, 50);
		panel3.setBackground(Color.lightGray);
		panel2.setLayout(new BorderLayout());
		
		
		label1 = new JLabel("NIEVERA'S PIZZA");
		label1.setForeground(Color.green);
		label1.setFont(font); //font
		label1.setVerticalAlignment(JLabel.CENTER); // make label center and only use in border layout manager
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setIcon(icon2);
		label1.setOpaque(true);
		
		/*
		button1 = new JButton("DARK");
		button1.setBounds(200, 200, 200, 100);
		button1.setForeground(Color.green);
		button1.setOpaque(true);
		button1.addActionListener(this);
		button1.setBackground(Color.gray); //color
		button1.setFocusable(false);
		
		
		
		button2 = new JButton("LIGHT");
		button2.setBounds(400, 200, 200, 100);
		button2.setForeground(Color.green);
		button2.setOpaque(true);
		button2.addActionListener(this);
		button2.setBackground(Color.gray); //color
		button2.setFocusable(false);
		
		*/

		
		
		
		frame.setLayout(new BorderLayout());
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null); // MAKE JFRAME CENTER
		
		frame.setVisible(true);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.CENTER);
		frame.add(panel4, BorderLayout.EAST);
		frame.add(panel5, BorderLayout.SOUTH);
		
		
		panel1.add(label1);
		frame.add(button1);
		frame.add(button2);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//black button
		if(e.getSource()==button1) {
			panel1.setBackground(Color.black);
			label1.setForeground(Color.green);
			button1.setBackground(Color.black); //color
			button2.setBackground(Color.black); //color
				
		}
		//white button
		if(e.getSource()==button2) {
			panel1.setBackground(Color.white);
			button1.setBackground(Color.white); //color
			button2.setBackground(Color.white); //color
			
			
		
	}
}}
