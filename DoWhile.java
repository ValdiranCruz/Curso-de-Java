package EstruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Digitre a palavra correta!!!");
			texto = input.nextLine();
			
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Fim do programa !!!!!!!!");
		input.close();
	}
}
