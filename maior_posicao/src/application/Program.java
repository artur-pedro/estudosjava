package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar ");
		int number = sc.nextInt();
		double[] numeros = new double[number];
		for(int i=0; i<number; i++) {
			
			System.out.println("Digite um numero: ");
			double numero = sc.nextDouble();
			numeros[i] = numero;	
		}
		double maiornumero =0;
		int posicao=0;
		for(int i=0; i<number; i++) {
			
			if(numeros[i] >= maiornumero) {
				
				maiornumero = numeros[i];
				posicao = i;
				
			}
		}
			
			System.out.printf("MAIOR VALOR = %.1f", maiornumero);
			System.out.println();
			System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
