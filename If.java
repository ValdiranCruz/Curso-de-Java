package EstruturaDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a m�dia");
		double media = input.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("aprovado");
			System.out.println("parb�ns");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}

		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;

		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		input.close();
	}

}
