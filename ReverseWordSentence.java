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

public class ReverseWordSentence extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWordSentence frame = new ReverseWordSentence();
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
	public ReverseWordSentence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE WORDS IN A SENTENCE");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(126, 11, 199, 19);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter a String");
		lb1.setForeground(Color.RED);
		lb1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 11));
		lb1.setBounds(10, 74, 157, 19);
		contentPane.add(lb1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(182, 71, 218, 22);
		contentPane.add(ta1);
		
		JLabel lb2 = new JLabel("Reversed each word in sentence");
		lb2.setForeground(Color.RED);
		lb2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 12));
		lb2.setBounds(10, 199, 177, 19);
		contentPane.add(lb2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(197, 195, 218, 22);
		contentPane.add(ta2);
		
		JButton rev = new JButton("REVERSE");
		rev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=ta1.getText();
				String arr[]=str.split(" ");
				String revsent="";
				for(int i=0;i<=arr.length-1;i++){
					String word=arr[i];
					String revword="";
					for(int j=word.length()-1;j>=0;j--){
						revword=revword+word.charAt(j);
					}
					revsent=revsent+revword+" ";
				}
				ta2.setText(revsent);
			}
		});
		rev.setForeground(Color.MAGENTA);
		rev.setBounds(126, 134, 143, 23);
		contentPane.add(rev);
	}
}
