package javapractice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui {

	public static void main(String[] args) {
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.black);
		bluepanel.setBounds(0,0, 600, 400);
		
		//title
		JTextField textfield = new JTextField();
		textfield.setBounds(0, 0, 600, 50);
		textfield.setText("ENTRANCE EXAM SAMPLE");
		textfield.setBackground(new Color(0x123456));
		textfield.setForeground(Color.white);
		textfield.setFont(new Font("Arial",Font.BOLD,30));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		
		//question
		JTextArea textarea = new JTextArea();
		textarea.setBounds(0, 50, 600, 50);
		textarea.setText("question number 1");
		textarea.setBackground(new Color(0x123456));
		textarea.setForeground(Color.white);
		textarea.setFont(new Font("Arial",Font.ITALIC,20));
		
		//button
		JButton buttonA = new JButton();
		buttonA.setBounds(0,120,50,50);
		buttonA.setText("A");
		buttonA.setBackground(Color.gray);
		buttonA.setForeground(Color.white);
		buttonA.setFont(new Font("Arial",Font.ITALIC,20));
		buttonA.setFocusable(false);
		
		JButton buttonB = new JButton();
		buttonB.setBounds(0,220,50,50);
		buttonB.setText("B");
		buttonB.setBackground(Color.gray);
		buttonB.setForeground(Color.white);
		buttonB.setFont(new Font("Arial",Font.ITALIC,20));
		buttonB.setFocusable(false);
		
		JButton buttonC = new JButton();
		buttonC.setBounds(300,120,50,50);
		buttonC.setText("C");
		buttonC.setBackground(Color.gray);
		buttonC.setForeground(Color.white);
		buttonC.setFont(new Font("Arial",Font.ITALIC,20));
		buttonC.setFocusable(false);
		
		JButton buttonD = new JButton();
		buttonD.setBounds(300,220,50,50);
		buttonD.setText("D");
		buttonD.setBackground(Color.gray);
		buttonD.setForeground(Color.white);
		buttonD.setFont(new Font("Arial",Font.ITALIC,20));
		buttonD.setFocusable(false);
		
		//choices
		JTextArea textareaA = new JTextArea();
		textareaA.setBounds(60, 120, 200, 50);
		textareaA.setText("Choices A");
		textareaA.setBackground(new Color(0x123456));
		textareaA.setForeground(Color.white);
		textareaA.setFont(new Font("Arial",Font.ITALIC,20));
		
		JTextArea textareaB = new JTextArea();
		textareaB.setBounds(60, 220, 200, 50);
		textareaB.setText("Choices B");
		textareaB.setBackground(new Color(0x123456));
		textareaB.setForeground(Color.white);
		textareaB.setFont(new Font("Arial",Font.ITALIC,20));
		
		JTextArea textareaC = new JTextArea();
		textareaC.setBounds(360, 120, 200, 50);
		textareaC.setText("Choices C");
		textareaC.setBackground(new Color(0x123456));
		textareaC.setForeground(Color.white);
		textareaC.setFont(new Font("Arial",Font.ITALIC,20));
		
		JTextArea textareaD = new JTextArea();
		textareaD.setBounds(360, 220, 200, 50);
		textareaD.setText("Choices D");
		textareaD.setBackground(new Color(0x123456));
		textareaD.setForeground(Color.white);
		textareaD.setFont(new Font("Arial",Font.ITALIC,20));
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(600,400);
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		
		frame.add(textareaA);
		frame.add(textareaB);
		frame.add(textareaC);
		frame.add(textareaD);
		frame.add(textarea);
		frame.add(textfield);
		frame.add(bluepanel);

		
		
	}

}
