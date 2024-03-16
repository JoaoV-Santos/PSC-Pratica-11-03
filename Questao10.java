/*A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que
 * recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.*/

import java.util.Scanner;

public class Questao10 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double peso;
		
		System.out.print("Insira seu peso em Kg: ");
		peso = input.nextDouble();
		
		System.out.printf("\n\nVocê deve tomar %.1f litros de água por dia" , (peso * 35) / 1000);
		
		input.close();
	}

}
