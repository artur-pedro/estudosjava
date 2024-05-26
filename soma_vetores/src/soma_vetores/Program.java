package soma_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor? ");
		int tamanho = sc.nextInt();
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		System.out.println("Digite os valores do vetor A: ");
		for(int i =0; i < tamanho; i++) {
			vetor1[i] = sc.nextInt();
				
			
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i =0; i < tamanho; i++) {
			vetor2[i] = sc.nextInt();
				
			
		}
		System.out.printf("VETOR RESULTANTE: ");
		for(int i =0; i < tamanho; i++) {
			System.out.println();
			System.out.printf("%d", vetor1[i] + vetor2[i]);
		}
		sc.close();
		

	}

}
