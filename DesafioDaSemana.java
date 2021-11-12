package EstruturaDeControle;

import java.util.Scanner;

public class DesafioDaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome do dia: ");

		String dia = input.next();
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		}
		if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Fim");
		}

		input.close();
	}

}
