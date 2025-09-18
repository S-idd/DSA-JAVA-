package PerfixSum;

import java.util.Scanner;

public class Q1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter The Size Of The Array :");
		int n = sc.nextInt();

		int Array[] = new int[n];

		System.out.print("Enter The Array Elements :");
		for (int i = 0; i < n; i++) {
			Array[i] = sc.nextInt();
		}

		for (int i = 1; i < Array.length; i++) {

			Array[i] =  Array[i - 1] + Array [ i ];
		}

		for (int i : Array) {

			System.out.print(i + " ");
		}

		System.out.println();

		int l = 1;
		
		int r = 3;

		int Q2 = Array[r] - Array[l -1];

		System.out.println(Q2);
	}
}
