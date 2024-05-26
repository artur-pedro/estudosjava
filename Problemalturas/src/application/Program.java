package application;

import java.util.Scanner;

import entities.Entidades;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0, count =0;
		int j =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int number = sc.nextInt();
		Entidades[] entidades = new Entidades[number];
		for(int i =0; i<entidades.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.println("Digite a idade: ");
			int age = sc.nextInt();
			System.out.println("Digite a altura: ");
			double height = sc.nextDouble();
			if(age < 16) {
				count++;
				entidades[j] = new Entidades(name, age, height);
				j++;
			}
			sum += height;
			}
		double mediaIdades = count/entidades.length*100;
		System.out.printf("Altura média: %.2f\n", sum/entidades.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", mediaIdades);
		System.out.println();
		for(int i =0; i< count; i++) {
			System.out.println(entidades[i].getName());
		}
		sc.close();

	}

}
