package com.anil.learning.swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField jpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LOGIN SYSTEMS");
		heading.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		heading.setBounds(153, 28, 156, 14);
		contentPane.add(heading);
		
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		username.setBounds(22, 84, 156, 14);
		contentPane.add(username);
		
		JLabel pass = new JLabel("PASSWORD");
		pass.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		pass.setBounds(22, 136, 156, 14);
		contentPane.add(pass);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(223, 80, 156, 22);
		contentPane.add(ta1);
		
		jpass = new JPasswordField();
		jpass.setBounds(223, 134, 156, 20);
		contentPane.add(jpass);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");
					Statement stmt=con.createStatement();
	String sql="Select * from login where username='"+ta1.getText()+"'and pass='"+jpass.getText()+"'";
    ResultSet rs=stmt.executeQuery(sql);
    if(rs.next())
    	JOptionPane.showMessageDialog(null, "login sucessful");
    else
    	JOptionPane.showMessageDialog(null, "invalid user name or password");
        con.close();
				}catch(Exception e){
					System.out.print(e);
				}
			}
		});
		btnLogin.setBounds(161, 194, 89, 23);
		contentPane.add(btnLogin);
	}
}
