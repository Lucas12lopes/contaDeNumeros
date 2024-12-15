package contagemDeNumeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int N = sc.nextInt();
		
		System.out.println("Contagem de 1 até " + N + ":");
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
