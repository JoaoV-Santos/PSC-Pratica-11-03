/*Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira
organizada e clara para a pessoa utilizadora.*/

import java.util.Scanner;

public class Questao05 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double base;
		double altura;
		double area;
		double perimetro;
		double diagonal;
		
		System.out.print("Informe a medida da base do retângulo: ");
		base = entrada.nextDouble();
		System.out.print("Informe a medida da altura do retângulo: ");
		altura = entrada.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("\nÁrea: %.2f" , area);
		System.out.printf("\nPerimetro: %.2f" , perimetro);
		System.out.printf("\nDiagonal: %.2f" , diagonal);
		
		
		entrada.close();
	}

}