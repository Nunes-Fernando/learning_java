package vetores;

import java.util.Scanner;

public class SomaMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos números você quer digitar ?");
		int quantity = sc.nextInt();
		
		double[] vect = new double[quantity];
		
		for(int i = 0; i < vect.length; i ++) {
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Valores digitados:");
		for(int i = 0; i < vect.length; i ++) {
			System.out.print(" " + vect[i]);
		}
		
		double sumTotal = 0;
		for(double sum : vect) {
			sumTotal += sum;
		}
		System.out.print("\nSoma dos valores: " + sumTotal + "\n");
		System.out.println("A media dos valores é: " +  sumTotal / quantity);
	}
}
