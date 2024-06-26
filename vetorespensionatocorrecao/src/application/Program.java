package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		for(int i=1; i <=n; i++) {
			
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		for(int i = 0; i<10; i++) {
			if(vect[i]!=null) {
			System.out.println(i + ": " + vect[i]);
		}
		sc.close();
		
		
	}

}
}