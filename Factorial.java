package com.anil.learning.swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Factorial extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial frame = new Factorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Factorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("FIND FACTORIAL");
		heading.setForeground(new Color(138, 43, 226));
		heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(147, 24, 130, 19);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter a number");
		lb1.setForeground(new Color(255, 0, 255));
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lb1.setBounds(39, 77, 130, 19);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Result");
		lb2.setForeground(new Color(139, 0, 0));
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lb2.setBounds(54, 182, 86, 19);
		contentPane.add(lb2);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf1.setBounds(172, 70, 174, 32);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tf2.setColumns(10);
		tf2.setBounds(172, 176, 189, 32);
		contentPane.add(tf2);
		
		JButton fact = new JButton("FACTORIAL");
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf1.getText();
				long num=Long.valueOf(str);
				long res=num;
				for(long i=num;i>1;i--){
					res=res*(i-1);
				}
				tf2.setText(String.valueOf(res));
				
			}
		});
		fact.setForeground(new Color(255, 0, 0));
		fact.setBounds(111, 131, 153, 23);
		contentPane.add(fact);
	}
}
