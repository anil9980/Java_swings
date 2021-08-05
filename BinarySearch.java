package com.anil.learning.swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(159, 11, 121, 18);
		contentPane.add(heading);
		
		JLabel lb1 = new JLabel("Enter elements");
		lb1.setForeground(new Color(255, 0, 0));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb1.setBounds(29, 56, 121, 18);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Enter a key to search");
		lb2.setForeground(new Color(154, 205, 50));
		lb2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lb2.setBounds(29, 96, 134, 18);
		contentPane.add(lb2);
		
		JLabel sort = new JLabel("Sorted array");
		sort.setForeground(new Color(0, 0, 139));
		sort.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		sort.setBounds(29, 136, 121, 18);
		contentPane.add(sort);
		
		JTextArea tasort = new JTextArea();
		tasort.setBounds(186, 134, 210, 22);
		contentPane.add(tasort);
		
		JLabel result = new JLabel("RESULT");
		result.setForeground(new Color(0, 0, 139));
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		result.setBounds(29, 181, 121, 18);
		contentPane.add(result);
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(186, 54, 210, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(186, 94, 210, 22);
		contentPane.add(ta2);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(186, 179, 210, 22);
		contentPane.add(ta3);
		
		JButton binary = new JButton("BINARY SEARCH");
		binary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sent=ta1.getText();
				String arr[]=sent.split(" ");
				String res="";
				for(int i=0;i<=arr.length-2;i++){
					for(int j=0;j<=arr.length-2-i;j++){
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])){
							String help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++){
				 res=res+arr[i]+" ";
				}
				tasort.setText(res);
				String key=ta2.getText();
				int low=0,mid,high=arr.length-1;
				String rev="";
				while(low<=high){
					mid=(low+high)/2;
					if(Integer.valueOf(key)==Integer.valueOf(arr[mid])){
						rev=rev+"key found @ "+" "+mid;
						break;
						}
					else if(Integer.valueOf(key)>Integer.valueOf(arr[mid])){
						low=mid+1;
						high=high;
					}
					else
					{
						high=mid-1;
						low=low;
					}
					
					}
				if(low>high){
					rev=rev+"key not found";	
				}
				
				ta3.setText(rev);
			}
		});
		binary.setForeground(new Color(255, 0, 255));
		binary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		binary.setBounds(170, 223, 189, 27);
		contentPane.add(binary);
		
		
		
		
		
		
	}
}
