package com.techelevator;

import java.util.Random;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {

		//system objects
		Scanner in = new Scanner(System.in);        //creating a scanner object
		Random random = new Random();                //creating a Random object which generates a random number

		//initial prompt
		System.out.println("Please enter number of traits to cross:");
		String input = in.nextLine();
		//getting the number of traits
		int numTraits = Integer.parseInt(input) /2;
		//error scenario
		if (numTraits == 0) {
			System.out.println("Invalid input");
		}
			System.out.println("Please enter trait(s) for Parent A:");
			String parentATraits = in.nextLine();
			System.out.println("Please enter trait(s) for Parent B:");
			String parentBTraits = in.nextLine();

			if(parentATraits.length() != parentBTraits.length()) {
				System.out.println("Invalid input, genotypes must have same number of traits");
			}
			if(parentATraits.length() % 2 != 0) {
				System.out.println("Invalid input");

			}





	}

}
