package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j =0;
		System.out.println("How many rooms will be rented?");
		int numero = sc.nextInt();
		Rooms[] room = new Rooms[10];
		int[] usedRooms	= new int[numero];
		for(int i=0; i<numero; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:", i+1);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.println();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.println();
			System.out.println("Room: ");
			int number = sc.nextInt();
			room[number] = new Rooms(name, email, number);	
			usedRooms[i] = number;
		}
		for(int i=0; i< numero; i++) {
			
			if(usedRooms[j] > usedRooms[j+1]) {
				int temp = usedRooms[j+1];
				usedRooms[j+1] =  usedRooms[j];
				usedRooms[j] = temp; 
			}
		}
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {
			
			if(i == usedRooms[j]) {
			System.out.printf("%d: %s, %s\n", room[i].getRoom(), room[i].getName(), room[i].getEmail());
			if(j == numero-1) {
				
				break;
			}
			j++;
	}
		sc.close();
		
	}
}
}
