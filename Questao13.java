/*Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o
 * denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato
 * de fração. e.g: ⅗ */

import java.util.Scanner;

public class Questao13 {
	
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num1,den1,num2,den2;
		
		System.out.print("Informe o numerador da primeira fração: ");
		num1 = leitor.nextInt();
		System.out.print("\nInforme o denominador da primeira fração: ");
		den1 = leitor.nextInt();
		System.out.print("\nInforme o numerador da segunda fração: ");
		num2 = leitor.nextInt();
		System.out.print("\nInforme o denominador da segunda fração: ");
		den2 = leitor.nextInt();
		
		System.out.println("\n\n" + num1 + " + " + num2 + " = " + (num1*den2 + den1*num2));
		System.out.println(den1 + "   " + den2 + " = " + den1 * den2);
		
		
		
		leitor.close();
	}

}
