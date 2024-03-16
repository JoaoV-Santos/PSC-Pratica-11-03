/*Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma
obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica
escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.*/

import java.util.Scanner;

public class Questao06 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double larguraArea;
		double comprimentoArea;
		double larguraCeramica;
		double comprimentoCeramica;
		double area;
		double areaCeramica;
		double qtdCeramica;
		
		System.out.print("\t\t\t\t\tCalculadora Revestimento Cerâmica (Em Metros)\n\n");
		System.out.print("Informe a largura da área a ser revestida: ");
		larguraArea = input.nextDouble();
		System.out.print("\nInforme o comprimento da área a ser revestida: ");
		comprimentoArea = input.nextDouble();
		System.out.print("\nInforme a largura da peça de cerâmica utilizada: ");
		larguraCeramica = input.nextDouble();
		System.out.print("\nInforme o comprimento peça de cerâmica utilizada: ");
		comprimentoCeramica = input.nextDouble();
		
		area = larguraArea * comprimentoArea;
		areaCeramica = larguraCeramica * comprimentoCeramica;
		qtdCeramica = (area / areaCeramica) * 1.1;
		System.out.printf("\n\nDeverão ser compradas %.2f cerâmicas." , qtdCeramica);
		
		
		
		input.close();
	}

}