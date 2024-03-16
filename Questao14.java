/*Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d
 * (P1,P2)=(x1-x2)2+(y1-y2)2 */

import java.util.Scanner;

public class Questao14 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		double x1,x2,y1,y2,distancia;
		
		System.out.print("Insira a cordenada x do primeiro ponto: ");
		x1 = input.nextDouble();
		System.out.print("\nInsira a cordenada y do primeiro ponto: ");
		y1 = input.nextDouble();
		System.out.print("\nInsira a cordenada x do segundo ponto: ");
		x2 = input.nextDouble();
		System.out.print("\nInsira a cordenada y do segundo ponto: ");
		y2 = input.nextDouble();
		
		distancia = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		
		System.out.printf("\n\nA distância entr os dois pontos é %.2f" , distancia);
		
		
		input.close();
	}

}
