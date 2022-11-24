package controller;

import model.Calculadora;
import view.Janela;

public class funcao {
	
	Calculadora calc = new Calculadora();
	
	public static void Btn(String num) {
		Calculadora.setValor1(num);
		Janela.Att();
	}
	
	public static void BtnPonto() {
		if(Calculadora.getValor1().equals("") == true) {
			Calculadora.setValor1("0.");
		}
		if(Calculadora.getValor1().contains(".") == false) {
			Calculadora.setValor1(".");
			
		}
		Janela.Att();
	}
	
	public static void BtnApagar() {
		if(Calculadora.getValor1().equals("") == false) {
			StringBuilder var = new StringBuilder(Calculadora.getValor1());
			int num;
			num = var.length();
			var.deleteCharAt( num - 1);
			Calculadora.setValor1Vazio(var.toString());
			Janela.Att();
		}
	}
	
	public static void BtnMaisOuMenos() {
		
		if(Calculadora.getValor1().equals("") == false) {
			if(Calculadora.getValor1().contains("-") == true) {
				StringBuilder var = new StringBuilder(Calculadora.getValor1());
				var.deleteCharAt(0);
				Calculadora.setValor1Vazio(var.toString());
				
			}else {
				String var = Calculadora.getValor1();
				Calculadora.setValor1Vazio("-" + var);
			}
		}
		Janela.Att();
	}
	
	
	public static void BtnSoma() {
		
		if(Calculadora.getValor2().equals("") == true) {
			
		Calculadora.setValor2(Calculadora.getValor1());
		Calculadora.setValor1Vazio("");
		}else {
			BtnIgualOp();
		}
		
		Janela.Att();
		Calculadora.setOperacao("SOMA");
	}
	
	public static void BtnDivisao() {
		
		if(Calculadora.getValor2().equals("") == true) {
			
		Calculadora.setValor2(Calculadora.getValor1());
		Calculadora.setValor1Vazio("");
		}else {
			BtnIgualOp();
		}
		
		Janela.Att();
		Calculadora.setOperacao("DIV");
	}
	
	public static void BtnMultiplicacao() {
		
		if(Calculadora.getValor2().equals("") == true) {
			
			Calculadora.setValor2(Calculadora.getValor1());
			Calculadora.setValor1Vazio("");
		}else {
				BtnIgualOp();
				
			}
		Janela.Att();
		Calculadora.setOperacao("MUL");
	}
	
	public static void BtnSubtracao() {
		
		if(Calculadora.getValor2().equals("") == true) {
		
			if(Calculadora.getValor1().equals("") == true) {
				Calculadora.setValor1("-");
			}
			if(Calculadora.getValor2().equals("") == true && Calculadora.getValor1().equals("-") == false) {
				
				Calculadora.setValor2(Calculadora.getValor1());
				Calculadora.setValor1Vazio("");
			}
				
		}else {
			BtnIgualOp();
		}
		
		
		
		Janela.Att();
		Calculadora.setOperacao("SUB");
	}
	
	public static void BtnIgual() {
		if(Calculadora.getValor2().equals("") == false) {
			switch(Calculadora.getOperacao()) {
				case "SOMA":
					Calculadora.SOMA();
					break;
				case "SUB":
					Calculadora.SUB();
					break;
				case "MUL":
					Calculadora.MUL();
					break;
				case "DIV":
					Calculadora.DIV();
				    break;
			}
			Calculadora.setValor2("");
		}
		Janela.Att();
	}
	
	public static void BtnIgualOp() {
		if(Calculadora.getValor2().equals("") == false) {
			switch(Calculadora.getOperacao()) {
				case "SOMA":
					Calculadora.SOMA();
					break;
				case "SUB":
					Calculadora.SUB();
					break;
				case "MUL":
					Calculadora.MUL();
					break;
				case "DIV":
					Calculadora.DIV();
				    break;
			}
			
		}
		Calculadora.setValor2(Calculadora.getValor1());
		Calculadora.setValor1Vazio("");
		Janela.Att();
	}
	
	public static void BtnLimpar() {
		Calculadora.Limpar();
		Janela.Att();
	}
	
}
