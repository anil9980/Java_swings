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

public class Sorting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorting frame = new Sorting();
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
	public Sorting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(124, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 14));
		heading.setBounds(170, 11, 62, 17);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("enter an array");
		lb1.setForeground(Color.BLUE);
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lb1.setBounds(10, 55, 89, 17);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("after sorting");
		lb2.setForeground(Color.BLUE);
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lb2.setBounds(10, 83, 77, 17);
		contentPane.add(lb2);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(118, 52, 235, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(118, 80, 235, 22);
		contentPane.add(ta2);
		
		JButton sort = new JButton("BUBBLE SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sent=ta1.getText();
				String arr[]=sent.split(" ");
				String help;
				String res="";
				for(int i=0;i<=arr.length-2;i++){
					for(int j=0;j<=arr.length-2-i;j++){
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])){
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++){
					res=res+arr[i]+" ";
				}
				ta2.setText(res);
			}
		});
		sort.setForeground(new Color(128, 0, 0));
		sort.setFont(new Font("Times New Roman", Font.BOLD, 10));
		sort.setBounds(163, 125, 149, 21);
		contentPane.add(sort);
	}
}
