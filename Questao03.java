/*Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 */

import java.util.Scanner;

public class Questao03 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.print("\t\t\t\t\t\tCalculadora Teorema de Pitágoras\n\n");
		System.out.print("Insira o valor de a: ");
		a = input.nextDouble();
		System.out.print("Insira o valor de b: ");
		b = input.nextDouble();
		
		c = Math.sqrt(a * a + b * b);
		System.out.printf("O resultado do teorema de Pitágoras é %.2f" , c);
		
		
		input.close();
	}

}