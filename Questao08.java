/*Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em
 * MB, a velocidade do link em Mbps e, retornar o tempo total em minutos. */

import java.util.Scanner;

public class Questao08 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		double velocidadeInternet;
		double tamanhoArquivo;
		
		System.out.print("Informe o tamanho do arquivo em MB: ");
		tamanhoArquivo = input.nextDouble();
		System.out.print("Informe a velocidade do link em Mbps: ");
		velocidadeInternet = input.nextDouble();
		
		tamanhoArquivo = tamanhoArquivo * 8;
		
		System.out.printf("\n\nO arquivo será baixado em aproximadamente %.5f minutos" , (tamanhoArquivo / velocidadeInternet) / 60);
		
		
		input.close();
	
	}

}
