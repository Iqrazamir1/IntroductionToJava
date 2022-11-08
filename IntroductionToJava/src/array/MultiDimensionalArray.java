package array;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		// Multiple dimensional array
		int[][] nums = new int [3][3]; 
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the values for rows and columns: ");
		
		for(int i = 0; i < 3; i++) { // Accepts the value
			for(int j = 0; j < 3; j++) {
				nums[i][j] = scn.nextInt();
			}
		}
	
		for(int i = 0; i < 3; i++) { // Prints the value
			for(int j = 0; j < 3; j++) {
				System.out.println(nums[i][j] +" ");
			}
			System.out.println(" ");
		}
		
		// Two dimensional array
		int twoDimensionalArray[][] = { {0,1,2}, {1,2,3}, {2,3,4} } ; 
		
		for(int[] a:twoDimensionalArray) {
			for(int b:a) {
				System.out.println(b);
			}
			System.out.println();
		}
		
	}
}
