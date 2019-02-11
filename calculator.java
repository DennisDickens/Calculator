package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculate {

	private JFrame frmNuelCalculator;
	private JTextField textField;
	
	double num1;
	double num2;
	double results;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate window = new Calculate();
					window.frmNuelCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuelCalculator = new JFrame();
		frmNuelCalculator.getContentPane().setBackground(Color.BLACK);
		frmNuelCalculator.setBackground(Color.BLACK);
		frmNuelCalculator.setForeground(Color.BLACK);
		frmNuelCalculator.setType(Type.POPUP);
		frmNuelCalculator.setTitle("Calc Nuel");
		frmNuelCalculator.setBounds(100, 100, 311, 468);
		frmNuelCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuelCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Imprint MT Shadow", Font.BOLD, 27));
		textField.setBounds(10, 11, 275, 62);
		frmNuelCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(10, 151, 60, 56);
		frmNuelCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(80, 151, 60, 56);
		frmNuelCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(155, 151, 60, 56);
		frmNuelCalculator.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnplus.setBounds(225, 84, 60, 56);
		frmNuelCalculator.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 218, 60, 56);
		frmNuelCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(80, 218, 60, 56);
		frmNuelCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(156, 218, 60, 56);
		frmNuelCalculator.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnminus.setBounds(225, 151, 60, 56);
		frmNuelCalculator.getContentPane().add(btnminus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 285, 60, 56);
		frmNuelCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(80, 285, 60, 56);
		frmNuelCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(156, 285, 60, 56);
		frmNuelCalculator.getContentPane().add(btn3);
		
		JButton btntimes = new JButton("*");
		btntimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btntimes.setFont(new Font("Tahoma", Font.BOLD, 24));
		btntimes.setBounds(225, 218, 60, 56);
		frmNuelCalculator.getContentPane().add(btntimes);
		
		JButton btnreset = new JButton("C");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnreset.setBounds(155, 84, 60, 56);
		frmNuelCalculator.getContentPane().add(btnreset);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(10, 351, 60, 56);
		frmNuelCalculator.getContentPane().add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				num2 = Double.parseDouble(textField.getText());
				if (operation == "+")
				{
					results = num1 + num2;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operation == "-")
				{
					results = num1 - num2;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operation == "*")
				{
					results = num1 * num2;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operation == "/")
				{
					results = num1 / num2;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operation == "%")
				{
					results = num1 % num2;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEqual.setBounds(225, 352, 60, 56);
		frmNuelCalculator.getContentPane().add(btnEqual);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 24));
		btndivide.setBounds(225, 285, 60, 56);
		frmNuelCalculator.getContentPane().add(btndivide);
		
		JButton btnbacks = new JButton("del");
		btnbacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String del=null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					del = strB.toString();
					textField.setText(del);
				}
			}
		});
		btnbacks.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnbacks.setBounds(10, 84, 60, 56);
		frmNuelCalculator.getContentPane().add(btnbacks);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btndecimal.getText();
				textField.setText(EnterNumber);
			}
		});
		btndecimal.setFont(new Font("Tahoma", Font.BOLD, 24));
		btndecimal.setBounds(80, 351, 60, 56);
		frmNuelCalculator.getContentPane().add(btndecimal);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnpercent.setBounds(80, 84, 60, 56);
		frmNuelCalculator.getContentPane().add(btnpercent);
		
		JButton btn00 = new JButton("Sqrt");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "Sqrt";
				
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn00.setBounds(155, 351, 60, 56);
		frmNuelCalculator.getContentPane().add(btn00);
	}
}
