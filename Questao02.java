/*Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam
que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a
pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas
a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha,
com base no custo.*/
import java.util.Scanner;

public class Questao02 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double precoGasolina;
		double precoEtanol;
		
		System.out.print("Insira o preço do litro da gasolina: ");
		precoGasolina = input.nextDouble();
		System.out.print("\nInsira o preço do litro do etanol: ");
		precoEtanol = input.nextDouble();
		
		if (precoEtanol < precoGasolina * 0.7)
			System.out.println("\n\nAbasteça com etanol.");
		else
			System.out.println("\n\nAbasteça com gasolina.");
		
		input.close();
	}

}