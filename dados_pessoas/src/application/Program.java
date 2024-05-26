package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double maioraltura = 0;
		double count=0;
		int counthomem=0;
		double alturamulheres=0;
		System.out.println("Quantas pessoas serão digitadas: ");
		int numero = sc.nextInt();
		double[] altura = new double[numero];
		char[] generos = new char[numero];
		double menoraltura = 0;
		for(int i=0; i<numero; i++) {
			System.out.printf("Altura da %d pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %d pessoa: ", i+1);
			generos[i] = sc.next().charAt(0);
			if (altura[i] >= maioraltura) {
				
				maioraltura = altura[i];
			}
			if (generos[i] == 'M') {
				
				counthomem++;
			}
			if (generos[i] == 'F') {
				
				alturamulheres += altura[i];
				count++;
			}
			
		}
		menoraltura = altura[0];
		for(int i=0; i<numero; i++) {
			
			if(menoraltura >= altura[i]) {
				
				menoraltura = altura[i];
			}
			
			
		}
		
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.println();
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.println();
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturamulheres/count);
		System.out.println();
		System.out.printf("Numero de homens = %d", counthomem);
		sc.close();
	}

}
