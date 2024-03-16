/*Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos
se passaram desde o início do dia (00:00)*/

import java.util.Scanner;

public class Questao01 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int hora;
		int minuto;
		int minutoDecorrido;
		
		System.out.print("Insira as horas no formato 24h: ");
		hora = input.nextInt();
		System.out.print("\nInsira os minutos no formato 24h: ");
		minuto = input.nextInt();
		minutoDecorrido = (hora * 60) + minuto;
		System.out.println("\nJá se passaram " + minutoDecorrido + " minutos desde o início do dia.");
		
		
		input.close();
	}

}