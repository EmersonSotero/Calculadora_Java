package view;

import javax.swing.JFrame;


import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;

import controller.funcao;
import model.Calculadora;

public class Janela extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Calculadora cal = new Calculadora();
	
	private static String number = new String();
	
	private static Label label1 = new Label("");
	private static Label label2 = new Label("");
	private final JButton btnLimpar = new JButton("C");
	
	
	public Janela() {
		getContentPane().setBackground(Color.DARK_GRAY);
		//config the Windows
		setTitle("Calculadora");
		setSize(286, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		final JButton btnMaisOuMenos = new JButton("+/-");
		final JButton btnApagar = new JButton("<-");
		final JButton btnDivisao = new JButton("/");
		final JButton btnMultiplicacao = new JButton("*");
		final JButton btnSubtracao = new JButton("-");
		final JButton btnAdicao = new JButton("+");
		final JButton btnPonto = new JButton(".");
		final JButton btnIgual = new JButton("=");
		final JButton btn9 = new JButton("9");
		final JButton btn8 = new JButton("8");
		final JButton btn7 = new JButton("7");
		final JButton btn6 = new JButton("6");
		final JButton btn5 = new JButton("5");
		final JButton btn4 = new JButton("4");
		final JButton btn3 = new JButton("3");
		final JButton btn2 = new JButton("2");
		final JButton btn1 = new JButton("1");
		final JButton btn0 = new JButton("0");
		
		//Labels
		label1.setBounds(10, 10, 250, 22);
		label1.setBackground(Color.WHITE);
		label1.setAlignment(Label.RIGHT);
		getContentPane().add(label1);
		
		label2.setAlignment(Label.RIGHT);
		label2.setBackground(Color.WHITE);
		label2.setBounds(10, 32, 250, 22);
		getContentPane().add(label2);
		
		
		btnLimpar.setBounds(10, 62, 55, 55);
		getContentPane().add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnLimpar();
			}
		});
		
		btnMaisOuMenos.setBounds(75, 62, 55, 55);
		getContentPane().add(btnMaisOuMenos);
		btnMaisOuMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnMaisOuMenos();
				
			}
		});
		
		
		btnDivisao.setBounds(205, 62, 55, 55);
		getContentPane().add(btnDivisao);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnDivisao();
				
			}
		});
		
		btnMultiplicacao.setBounds(205, 128, 55, 55);
		getContentPane().add(btnMultiplicacao);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnMultiplicacao();
				
			}
		});
		
		btnSubtracao.setBounds(205, 195, 55, 55);
		getContentPane().add(btnSubtracao);
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnSubtracao();
				
			}
		});
		
		btnAdicao.setBounds(205, 261, 55, 55);
		getContentPane().add(btnAdicao);
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnSoma();
				
			}
		});
		
		
		
		btnPonto.setBounds(75, 326, 55, 55);
		getContentPane().add(btnPonto);
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnPonto();
				
			}
		});
		
		btnApagar.setBounds(140, 62, 55, 55);
		getContentPane().add(btnApagar);
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnApagar();
				
			}
		});
		
		btnIgual.setBounds(140, 326, 120, 55);
		getContentPane().add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.BtnIgual();
				
			}
		});
		
		
		//***************************************//
		
		btn9.setBounds(140, 128, 55, 55);
		getContentPane().add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("9");
			}
		});
		
		btn8.setBounds(75, 128, 55, 55);
		getContentPane().add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("8");
			}
		});
		
		btn7.setBounds(10, 128, 55, 55);
		getContentPane().add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("7");
			}
		});
		
		btn6.setBounds(140, 195, 55, 55);
		getContentPane().add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("6");
			}
		});
		
		btn5.setBounds(75, 195, 55, 55);
		getContentPane().add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    funcao.Btn("5");
			}
		});
		
		btn4.setBounds(10, 195, 55, 55);
		getContentPane().add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("4");
			}
		});
		
		btn3.setBounds(140, 261, 55, 55);
		getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("3");
			}
		});
		
		btn2.setBounds(75, 261, 55, 55);
		getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("2");
			}
		});
		
		
		btn1.setBounds(10, 261, 55, 55);
		getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("1");
			}
		});
		
		
		btn0.setBounds(10, 326, 55, 55);
		getContentPane().add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcao.Btn("0");
			}
		});
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Janela();
	}
	
	public static String setNumber() {
		return number;
	}
	
	public static void Att() {
		label2.setText(Calculadora.getValor1());
		label1.setText(Calculadora.getValor2());
	}
}
