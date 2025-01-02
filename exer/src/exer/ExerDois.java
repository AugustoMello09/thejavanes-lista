package exer;

public class ExerDois {
	
	/*
	 * 2 - Faça um programa que leia um valor 𝑛 n, inteiro e positivo, calcule e
	 * mostre a seguinte soma: S=1+21 +31 +41 +…+n1
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Soma final: " + somaDaSequencia(7));
		
	}
	
	public static int somaDaSequencia(int n) {
		int soma = 0;
		
		for (int i = 1; i <= n; i++) {
			 System.out.println("S: " + verifica(i));
			 var verificado = verifica(i);
			 soma += verificado;
		}
		
		return soma;
	}
	
	public static int verifica(int n) {
		if(n == 1) {
			return n;
		}
		return n * 10 + 1;
	}

}
