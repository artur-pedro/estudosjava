package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Quantas pessoas voce vai digitar");
		int numero = sc.nextInt();
		String[] nome = new String[numero];
		int[] idade = new int[numero];
		
		for(int i=0; i<numero; i++) {
			
			System.out.printf("Dados da %da pessoa", i+1);
			System.out.println();
			System.out.printf("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		int maioridade = 0;
		int posicao = 0;
		for(int i=0; i<numero; i++) {
			
			if(idade[i] > maioridade) {
				maioridade = idade[i];
				posicao = i;
				
			}
		
				
		}
		System.out.println(maioridade);
		System.out.println(nome[posicao]);
		sc.close();
	}

}
