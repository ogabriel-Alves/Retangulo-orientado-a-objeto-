package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Equação;


public class Execução {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Equação equacao = new Equação();
		
		System.out.println("Enter rectangle width and heright:");
		equacao.width = sc.nextDouble();
		equacao.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", equacao.area()  );
		System.out.printf("PERIMETER = %.2f%n", equacao.perimeter()  );
		System.out.printf("DIAGONAL = %.2f%n", equacao.diagonal()  );

		sc.close();
	}

}
