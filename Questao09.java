/*Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso
 * ideal e o peso ideal ajustado*/

import java.util.Scanner;

public class Questao09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		double pesoIdeal = 0;
		double pesoIdealAjustado;
		char genero;
		double coeficiente;
		
		System.out.print("Informe seu gênero (m ou f): ");
		genero = input.next().charAt(0);
		System.out.print("\nInforme o seu peso em Kg: ");
		peso = input.nextDouble();
		System.out.print("\nInforme a sua altura em cm: ");
		altura = input.nextDouble();
		
		
		if (genero == 'm')
			coeficiente = 0.75;
		else
			coeficiente = 0.67;
		
		pesoIdeal = 52 + (coeficiente * (altura - 152.4));
		pesoIdealAjustado = ((peso - pesoIdeal) * 0.25) + pesoIdeal;
		
		altura = altura / 100;
		imc = peso / (altura * altura);
		
		System.out.printf("\n\nIMC: %.2f" , imc);
		System.out.printf("\nPeso Ideal: %.2f Kg" , pesoIdeal);
		System.out.printf("\nPeso Ideal Ajustado: %.2f Kg" , pesoIdealAjustado);
		
		input.close();
	}

}
