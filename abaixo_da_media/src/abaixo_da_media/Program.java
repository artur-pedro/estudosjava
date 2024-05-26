package abaixo_da_media;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int tamanho = sc.nextInt();
		double sum = 0;
		double[] numeros = new double[tamanho]; 
		for(int i=0; i<tamanho; i++) {
			System.out.printf("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
	}
			double media = sum/numeros.length;
			System.out.printf("MEDIA DO VETOR = %.3f", sum/numeros.length);
			System.out.println();
			System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			for(int i =0; i<numeros.length; i++) {
				if(numeros[i] < media) {
					
					System.out.println(numeros[i]);
				}
				
			}
			
			sc.close();
	}

}
