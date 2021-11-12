package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		while (nota != -1) {
			System.out.println(" Informe a Nota ");
			nota = input.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}else if (nota != -1){
				System.out.println("Nota invalida!!!!");
			}

		}
// Calcular a Média 
		double media = total / quantidadeDeNotas;
		System.out.println("A média é; " + media);
		input.close();
	}
}
