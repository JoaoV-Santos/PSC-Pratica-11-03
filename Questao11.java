/*Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência
 * do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência
 * pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor
 * pago por eles.*/

import java.util.Scanner;

public class Questao11 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double potenciaW;
		double tempoLigado;
		double valorKWh;
		double consumo;
		
		System.out.print("Informe a potência do aparelho: ");
		potenciaW = input.nextDouble();
		System.out.print("\nInforme quantas horas o aparelho fica ligado por dia: ");
		tempoLigado = input.nextDouble();
		System.out.print("\nInforme o valor atual do KWh: ");
		valorKWh = input.nextDouble();
		
		consumo = valorKWh * (potenciaW * tempoLigado) / 1000;
		
		System.out.println("\n\nA quantidade de KW/h consumido pelo equipamento foi " + (potenciaW * tempoLigado) / 1000);
		
		System.out.printf("\nSerá pago o valor de aproximdamente %.2f por dia" , consumo);
		
		
		
		
		input.close();
	}

}
