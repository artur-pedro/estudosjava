package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				
				if(i==j) {
					
				System.out.printf("%d ", mat[i][j]);
				
				}
				
				
			}
			
		}
		System.out.println();
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				
				if(mat[i][j] < 0) {
					
				count++;
				
				}
				
			}
		}
		
		System.out.printf("Negative numbers = %d", count);
		
		
		
		
		sc.close();
		
	}

}
