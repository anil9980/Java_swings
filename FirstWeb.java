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
import java.awt.SystemColor;

public class FirstWeb extends JFrame {

	private JPanel contentPane;
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWeb frame = new FirstWeb();
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
	public FirstWeb() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		heading.setBackground(Color.RED);
		heading.setBounds(153, 21, 76, 20);
		contentPane.add(heading);
		
		JLabel labelA = new JLabel("A");
		labelA.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelA.setBackground(Color.RED);
		labelA.setBounds(123, 52, 11, 20);
		contentPane.add(labelA);
		
		JLabel labelB = new JLabel("B");
		labelB.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelB.setBackground(Color.RED);
		labelB.setBounds(123, 83, 12, 20);
		contentPane.add(labelB);
		
		JLabel res = new JLabel("RES");
		res.setFont(new Font("Times New Roman", Font.BOLD, 17));
		res.setBackground(Color.RED);
		res.setBounds(123, 113, 32, 20);
		contentPane.add(res);
		
		tfA = new JTextField();
		tfA.setBounds(163, 52, 86, 20);
		contentPane.add(tfA);
		tfA.setColumns(10);
		
		tfB = new JTextField();
		tfB.setColumns(10);
		tfB.setBounds(163, 85, 86, 20);
		contentPane.add(tfB);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(165, 115, 86, 20);
		contentPane.add(tfResult);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfA.getText();
				String data2=tfB.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfResult.setText(result);
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 11));
		add.setForeground(Color.MAGENTA);
		add.setBackground(SystemColor.controlHighlight);
		add.setBounds(10, 166, 65, 23);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.setForeground(Color.MAGENTA);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfA.getText();
				String data2=tfB.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfResult.setText(result);
			}
		});
		sub.setBounds(85, 166, 72, 23);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.setForeground(Color.MAGENTA);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfA.getText();
				String data2=tfB.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1*var2;
				String result=String.valueOf(res);
				tfResult.setText(result);
			}
		});
		mul.setBounds(163, 166, 65, 23);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.setForeground(Color.MAGENTA);
		div.setFont(new Font("Times New Roman", Font.BOLD, 11));
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfA.getText();
				String data2=tfB.getText();
				float var1=Float.valueOf(data1);
				float var2=Float.valueOf(data2);
				float res=var1/var2;
				String result=String.valueOf(res);
				tfResult.setText(result);
			}
		});
		div.setBounds(239, 166, 71, 23);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.setForeground(Color.MAGENTA);
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1=tfA.getText();
				String data2=tfB.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1%var2;
				String result=String.valueOf(res);
				tfResult.setText(result);
			}
		});
		rem.setBounds(331, 166, 72, 23);
		contentPane.add(rem);
		
		JButton clr = new JButton("CLEAR");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfA.setText("");
				tfB.setText(null);
				tfResult.setText(null);
			}
		});
		clr.setForeground(Color.MAGENTA);
		clr.setBounds(164, 206, 85, 23);
		contentPane.add(clr);
	}
}
