package EstruturaDeControle;

import java.util.Scanner;

// while e mais recomendado quando NÃO sabe a quntidade de Repetições 
public class While_Indetreminado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valor = "";
		
		while (!valor.equalsIgnoreCase("Sair")) {
			System.out.print("Você diz: ");
			valor = input.nextLine();
		}
		System.out.println("Fim do programa !!!");
		input.close();
	}
	

}
