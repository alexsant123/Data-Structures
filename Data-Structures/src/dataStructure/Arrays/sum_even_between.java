package Arrays;

import java.util.Scanner;

public class sum_even_between {

	public static void main(String[] args) {
		
		//**Sum of Even Numbers: Write a program that calculates the sum of all even numbers between 1 and n.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter with  a number");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				sum = sum + i;

			}

		}

		System.out.println(sum);
	}

}
