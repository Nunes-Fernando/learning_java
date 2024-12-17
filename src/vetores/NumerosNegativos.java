package vetores;

import java.util.Scanner;

public class NumerosNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você quer digitar ?");
		
		int quantity = sc.nextInt();
		
		int[] vect = new int[quantity];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos:");
		
		for(int valor : vect) {
			if(valor < 0) {
				System.out.println(valor);
			}
		}
		
	}
}
