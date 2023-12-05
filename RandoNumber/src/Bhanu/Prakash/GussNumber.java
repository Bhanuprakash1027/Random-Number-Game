package Bhanu.Prakash;

import java.io.Reader;
import java.util.Random;
import java.util.Scanner;


public class GussNumber {

	public static void main(String[] args) {
		// Initialization and taking user input
		Scanner sc=new Scanner(System.in);
		String play="yes";
		
		while(play.equals("yes")) {
			Random num=new Random();// import the package 
			int rannum=num.nextInt(100);// this is the range method
			// how much tange you want put the maximum range on the method 
			// here why we are taken the num is any time different number can get it.
			int guess=-1;
			int tries=0;
			
			while(guess!=rannum) {
				System.out.println("Guess the number between 1 to 100");// first of we can show 
				// this line 
				guess=sc.nextInt();// user input data reader
				tries++;
			
			if(guess==rannum) {  // if user guess the number following the op
				System.out.println("Awsome! you guess the number");
				System.out.println("It only took you"+ tries +"Guess!");
				System.out.println("would you like to play againe? YES or No");
				play=sc.next().toLowerCase();
			}
			else if(guess>rannum) { // else part here
				System.out.println("your guess Too High:");
			}
			else {
				System.out.println("your guess Too Low");
			}

		}
		}
	sc.close();	
	}

}
