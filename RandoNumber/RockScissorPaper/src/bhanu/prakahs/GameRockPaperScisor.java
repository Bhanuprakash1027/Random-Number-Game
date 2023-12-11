package bhanu.prakahs;

import java.util.Random;
import java.util.Scanner;

public class GameRockPaperScisor {
	
	static int user1=0;
	static int user2=0;
	 String round;
	
	String game= "yes";
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("we are going to play game soon:");
		System.out.println("Enter user 1 numer less than equal 3");
		user1=sc.nextInt();
		System.out.println("Enter user 2 numer less than equal 3");
		user2=sc.nextInt();
		
		if(user1==1&user2==1)
			System.out.println("game tie");
		else if(user1==2&user2==2) 
			System.out.println("game tie");
		else if(user1==3&user2==3)
			System.out.println("Game tie");
		else if(user1==1&user2==2) 
			System.out.println("user2 win");
		else if(user1==1&user2==3) 
			System.out.println("user2 win");
		else if(user1==2&user2==1) 
			System.out.println("user1 win");
		else if(user1==2&user2==3) 
			System.out.println("user2 win");
		else if(user1==3&user2==1) 
			System.out.println("user1 win");
		else if(user1==3&user2==2) 
			System.out.println("user1 win");
		else
			System.out.println("enterend wrong number");
		
		
		}
		}

	
