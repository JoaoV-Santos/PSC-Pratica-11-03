/*Crie um programa para calcular a regra de três.*/

import java.util.Scanner;

public class Questao04 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		
		System.out.print("Insira o valor de a: ");
		a = entrada.nextDouble();
		System.out.print("\nInsira o valor de b: ");
		b = entrada.nextDouble();
		System.out.print("\nInsira o valor de c: ");
		c = entrada.nextDouble();
		
		x = (a * b) / c;
		
		System.out.println("\nO valor de x é: " + x);
		
		
		
		entrada.close();
	}

}