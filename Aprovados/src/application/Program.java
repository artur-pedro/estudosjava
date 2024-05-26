package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados? ");
		int number = sc.nextInt();
		int j=0;
		String[] nomeAlunos = new String[number];
		double[] vetornotas1 = new double[number];
		double[] vetornotas2 = new double[number];
		String[] alunosaprovados = new String[number];
		for(int i=0; i<number; i++) {
		sc.nextLine();
		System.out.printf("Digite o nome, primeira e segunda nota do %do aluno:", i+1);
		nomeAlunos[i] = sc.nextLine();
		vetornotas1[i] = sc.nextDouble();
		vetornotas2[i] = sc.nextDouble();
		double media = (vetornotas1[i]+vetornotas2[i])/2.0;
		if(media>=6.0) {
			alunosaprovados[j] = nomeAlunos[i];
			j++;
		}
		
		
		}
		System.out.println("Alunos aprovados:");
		for(int i=0; i<j; i++) {
			System.out.println(alunosaprovados[i]);
			
		}
		sc.close();
		

	}

}
