package conversor.application;

import java.util.Scanner;

import conversor.entities.CurrencyConvert;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought ? ");
		double howMany = sc.nextDouble();
		
		System.out.println("Amount to be paind in reais " + 
				CurrencyConvert.dollarInReais(howMany, dollarPrice));
		
	}
}
