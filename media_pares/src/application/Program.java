package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		double count2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor");
		int numero = sc.nextInt();
		int[] vetor = new int[numero];
		for(int i=0; i<numero; i++) {
			
			System.out.printf("Digite um numero?");
			int tempnum = sc.nextInt();
			if(tempnum % 2 == 0) {
				
				vetor[i] = tempnum;
				count += tempnum;
				count2++;
			}
		}
		if(count2 != 0) {
		System.out.printf("MEDIA DOS PARES = %.1f", count/count2);

	}
		else {
			
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
}
}
