package exerciciosuri;

import java.util.Scanner;

public class Exercicio1002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o raio: ");
		double raio = entrada.nextDouble();
		
		double n = 3.14159;
		double area = n * (raio * raio);
		
		System.out.printf("A=%.4f", area);
		

	}

}
