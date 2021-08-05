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

public class GCD extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GCD frame = new GCD();
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
	public GCD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("GCD FINDER");
		heading.setForeground(new Color(0, 206, 209));
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(138, 25, 94, 18);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter 1 number");
		lb1.setForeground(new Color(0, 206, 209));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb1.setBounds(29, 81, 117, 18);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Enter 2 number");
		lb2.setForeground(new Color(0, 206, 209));
		lb2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb2.setBounds(29, 110, 99, 18);
		contentPane.add(lb2);
		
		tf1 = new JTextField();
		tf1.setBounds(187, 81, 173, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(187, 110, 173, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel lb3 = new JLabel("ANSWER");
		lb3.setForeground(new Color(0, 206, 209));
		lb3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb3.setBounds(29, 206, 94, 18);
		contentPane.add(lb3);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(187, 206, 173, 20);
		contentPane.add(tf3);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st1=tf1.getText();
				String st2=tf2.getText();
				long num1=Long.valueOf(st1);
				long num2=Long.valueOf(st2);
				long gcd=1,k=1;
				while(k<=num1 && k<=num2){
					if(num1%k==0&&num2%k==0){
						gcd=k;
					}
					k++;
				}
				tf3.setText(String.valueOf(gcd));
			}
		});
		btnCalculate.setForeground(new Color(255, 0, 0));
		btnCalculate.setBounds(119, 152, 117, 23);
		contentPane.add(btnCalculate);
		
		
	}
}
