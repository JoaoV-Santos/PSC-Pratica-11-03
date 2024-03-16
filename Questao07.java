/*Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.*/

import java.util.Scanner;

public class Questao07 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double larguraArea;
		double comprimentoArea;
		double larguraCeramica;
		double comprimentoCeramica;
		double area;
		double areaCeramica;
		double qtdCeramica;
		double valorCeramica;
		
		System.out.print("\t\t\t\t\tCalculadora Revestimento Cerâmica (Em Metros)\n\n");
		System.out.print("Informe a largura da área a ser revestida: ");
		larguraArea = input.nextDouble();
		System.out.print("\nInforme o comprimento da área a ser revestida: ");
		comprimentoArea = input.nextDouble();
		System.out.print("\nInforme a largura da peça de cerâmica utilizada: ");
		larguraCeramica = input.nextDouble();
		System.out.print("\nInforme o comprimento peça de cerâmica utilizada: ");
		comprimentoCeramica = input.nextDouble();
		System.out.print("\nInforme o valor da peça de cerâmica utilizada: ");
		valorCeramica = input.nextDouble();
		
		
		area = larguraArea * comprimentoArea;
		areaCeramica = larguraCeramica * comprimentoCeramica;
		qtdCeramica = (area / areaCeramica) * 1.1;
		System.out.printf("\n\nDeverão ser compradas %.2f cerâmicas. O valor total gasto será de aproximadamente %.2f." , qtdCeramica , valorCeramica * qtdCeramica);
		
		
		
		input.close();
	}

}