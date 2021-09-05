package com.fenyenos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel titleLabel, binaryLabel, resultLabel;
	private JButton button;
	private JTextField textField;
	private ImageIcon icon;
	
	public GUI() {
		frame = new JFrame();
		panel = new JPanel();
		
		
		frame.setTitle("Binary Convertor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(650, 300);
		panel.setLayout(null);
		
		icon = new ImageIcon("icon.png");
		frame.setIconImage(icon.getImage());
		
		titleLabel = new JLabel("BINARY CONVERTOR");
		titleLabel.setFont(titleLabel.getFont().deriveFont(30.0f));
		titleLabel.setBounds(150, 10, 400, 40);
		panel.add(titleLabel);
		
		binaryLabel = new JLabel("Insert Binary:");
		binaryLabel.setFont(binaryLabel.getFont().deriveFont(15.0f));
		binaryLabel.setBounds(25, 80, 150, 25);
		panel.add(binaryLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 80, 320, 25);
		panel.add(textField);		
		
		button = new JButton("Convert");
		button.setBounds(250, 135, 80, 25);
		button.addActionListener(this);
		panel.add(button);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(resultLabel.getFont().deriveFont(15.0f));
		resultLabel.setBounds(150, 190, 320, 25);
		panel.add(resultLabel);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = textField.getText();
		String output = Translator.convertBinary(input);
		resultLabel.setText(input + " is equal to " + output);
	}
}
