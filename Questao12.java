/*Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento
 * inserido.*/

import java.util.Scanner;

public class Questao12 {
	
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
		
		System.out.printf("\nSerá pago o valor de aproximadamente R$ %.2f por mês" , consumo * 30);
		
		
		
		
		input.close();
	}

}
