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

public class SelectionSort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionSort frame = new SelectionSort();
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
	public SelectionSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setForeground(new Color(250, 240, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SELECTION SORT");
		heading.setForeground(new Color(0, 0, 205));
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(132, 21, 143, 18);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter elements ");
		lb1.setForeground(new Color(173, 255, 47));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb1.setBounds(10, 76, 108, 18);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Sorted Array");
		lb2.setForeground(new Color(255, 215, 0));
		lb2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb2.setBounds(10, 178, 108, 18);
		contentPane.add(lb2);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(132, 74, 235, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(132, 176, 235, 22);
		contentPane.add(ta2);
		
		JButton sort = new JButton("SELECTION SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=ta1.getText();
				String arr[]=str.split(" ");
				String res="";
				for(int i=0;i<=arr.length-2;i++){
					String min=arr[i];
					int pos=i;
					for(int j=i+1;j<=arr.length-1;j++){
						if(Integer.valueOf(arr[j])<Integer.valueOf(min)){
							min=arr[j];
							pos=j;
							
						}
					}
					String help=arr[i];
					arr[i]=arr[pos];
					arr[pos]=help;
					
				}
				for(int i=0;i<=arr.length-1;i++){
				 res=res+String.valueOf(arr[i])+" ";}
				ta2.setText(res);
			}
		});
		sort.setForeground(new Color(255, 0, 0));
		sort.setBounds(132, 127, 166, 23);
		contentPane.add(sort);
	}

}
