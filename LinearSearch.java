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

public class LinearSearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
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
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		heading.setBounds(151, 11, 96, 14);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter  elements");
		lb1.setForeground(Color.RED);
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lb1.setBounds(24, 59, 113, 18);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Enter key to search");
		lb2.setForeground(Color.RED);
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lb2.setBounds(24, 112, 129, 18);
		contentPane.add(lb2);
		
		JLabel lb3 = new JLabel("Result");
		lb3.setForeground(new Color(0, 0, 255));
		lb3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb3.setBounds(24, 159, 96, 14);
		contentPane.add(lb3);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(175, 54, 180, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(175, 107, 180, 22);
		contentPane.add(ta2);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(175, 154, 180, 22);
		contentPane.add(ta3);
		
		JButton search = new JButton("LINEAR SEARCH");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sent=ta1.getText();
				String arr[]=sent.split(" ");
				String res="";
				String key=ta2.getText();
				for(int i=0;i<=arr.length-1;i++){
					if(Integer.valueOf(key)==Integer.valueOf(arr[i])){
						res=res+"key found @"+" "+i;
						
					}
					
				}
				if(res==""){
				res=res+"key not found";
				}
				ta3.setText(res);
			}
		});
		search.setForeground(new Color(255, 0, 255));
		search.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		search.setBounds(142, 210, 163, 23);
		contentPane.add(search);
	}
}
