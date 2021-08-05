package com.anil.learning.swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseWord extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWord frame = new ReverseWord();
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
	public ReverseWord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE STRING");
		heading.setForeground(new Color(0, 250, 154));
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(153, 11, 126, 18);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter a String");
		lb1.setForeground(new Color(255, 0, 0));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb1.setBounds(28, 67, 108, 18);
		contentPane.add(lb1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(166, 65, 205, 22);
		contentPane.add(ta1);
		JLabel lb2 = new JLabel("Reversed String");
		lb2.setForeground(new Color(165, 42, 42));
		lb2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb2.setBounds(30, 180, 126, 18);
		contentPane.add(lb2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(166, 178, 205, 22);
		contentPane.add(ta2);
		
		JButton reverse = new JButton("REVERSE");
		reverse.setForeground(new Color(0, 0, 205));
		reverse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		reverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sent=ta1.getText();
				char ch1[]=sent.toCharArray();
				char ch2[]=new char[ch1.length];
				int j=ch1.length-1;
				for(int i=0;i<=ch1.length-1;i++){
					ch2[j]=ch1[i];
					j--;
				}
				String res=new String(ch2);
				ta2.setText(res);
			}
		});
		reverse.setBounds(121, 125, 139, 27);
		contentPane.add(reverse);
		
		
	}
}
