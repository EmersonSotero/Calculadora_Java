package model;

public class Calculadora {

	private static String valor1 = new String("");
	private static String valor2 = new String();

	private static String operacao = new String();
	private static double num1;
	private static double num2;
	

	
	public static String getValor2() {
		return valor2;
	}
	public static void setValor2(String valor2) {
		Calculadora.valor2 = valor2;
	}
	public static String getValor1() {
		return valor1;
	}
	public static void setValor1(String valor1) {
		Calculadora.valor1 += valor1;
	}
	
	public static void setValor1Vazio(String valor1) {
		Calculadora.valor1 = valor1;
	}
	public static String getOperacao() {
		return operacao;
	}
	public static void setOperacao(String operacao) {
		Calculadora.operacao = operacao;
	}
	
	
	public static void SOMA() {
		num1 = Double.parseDouble(valor1);
		num2 = Double.parseDouble(valor2);
		valor1 = Double.toString( num1 + num2);
		
	}
	
	public static void SUB() {
		num1 = Double.parseDouble(valor1);
		num2 = Double.parseDouble(valor2);
		valor1 = Double.toString( num2 - num1);
		
	}
	public static void DIV() {
		num1 = Double.parseDouble(valor1);
		num2 = Double.parseDouble(valor2);
		valor1 = Double.toString( num2 / num1);
		
	}
	public static void MUL() {
		num1 = Double.parseDouble(valor1);
		num2 = Double.parseDouble(valor2);
		valor1 = Double.toString( num1 * num2);
		
	}
	
	public static void Limpar() {
		valor1 = "";
		valor2 = "";
		operacao = "";
		num1 = 0;
		num2 = 0;
	}
}
