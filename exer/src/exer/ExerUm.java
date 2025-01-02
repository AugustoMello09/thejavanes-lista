package exer;

public class ExerUm {
	
	/*
	 * 1 - Faça um programa que verifique e mostre os números entre 1000 e 2000 (inclusive) 
		que, quando divididos por 11, produzam resto igual a 5.
	 * */
	
	public static void main(String[] args) {
		for(int i = 1000; i <= 2000; i++) {
			var verificado = verifica(i);
			if (verificado) {
				System.out.println("Número verificado: " + i);
			} 
		}
	}
	
	public static boolean verifica(int numero) {
		return numero % 11 == 5;
	}
}
