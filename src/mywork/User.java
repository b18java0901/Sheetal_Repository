package mywork;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1 ;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("home");
		button.setBounds(10, 10, 49, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setBounds(36, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setBounds(257, 71, 34, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("    AREA UNIT CONVERTER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(122, 27, 169, 33);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(36, 130, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Square[m^2]", "Square kilomiter[km^2]", "Square centimiter[cm^2]", "Square milimiter[mm^2]"}));
		comboBox_1.setBounds(257, 96, 150, 22);
		contentPane.add(comboBox_1);
		comboBox_1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				double a ,c =0;
				a=Double.valueOf(textField.getText());
				try {
					//no 0 point in index
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==0)
					{
						 c=a;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==1)
					{
						c=a*0.000001;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==2)
					{
						c=a*10000;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==3)
					{
						c=a*1000000;
					}  
						//no 1 point in index
					if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==0)
							{
								 c=a*1000000;
							}
							if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==1)
							{
								c=a;
							}
							if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==2)
							{
								c=a*1000000*10000;
							}
							if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==3)
							{
								c=a*1000000*100000;
								}
								 // no 2 point in index
							        	if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==0)
										{
											 c=a*0.0001;
										}
										if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==1)
										{
											c=a*1.E-10;
										}
										if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==2)
										{
											c=a;
										}
										if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==3)
										{
											c=a*100;
										}
										//no 3 point in index
												if(comboBox.getSelectedIndex()==3 && comboBox_1.getSelectedIndex()==0)
												{
													 c=a*0.000001;
												}
												if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==1)
												{
													c=a*1.E-12;
												}
												if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==2)
												{
													c=a*0.01;
												}
												if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==3)
												{
													c=a;
												}
				
				textField_1.setText(String.valueOf(c));
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Square[m^2]", "Square kilomiter[km^2]", "Square centimiter[cm^2]", "Square milimiter[mm^2]"}));
		comboBox.setBounds(36, 97, 150, 22);
		contentPane.add(comboBox);
		
	
		textField_1 = new JTextField();
		textField_1.setBounds(257, 130, 92, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
