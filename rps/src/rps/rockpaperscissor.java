package rps;

import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
				System.out.println(" RPS ");
				
				int comScore = 0;
				int userScore = 0;
				
		String [] RPS = {"Rock", "Paper", "Sciossors"};
		
		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.nextLine();
		
		Random random = new Random();
		
		int rand = random.nextInt(3);
		
		System.out.println(RPS[rand]);
		
		if(userInput.equals("Paper") && RPS  [rand].equals("Scissors")) {
			comScore = comScore + 1;
			}
		
		else if (userInput == "Rock" && RPS  [rand].equals("Paper")) {
			userScore = userScore + 1;
		}
		
		else if (userInput.equals ("Paper") && RPS  [rand].equals("Rock")) {
			comScore = comScore + 1;
		}
		
		else if (userInput.equals  ("Scissors") && RPS  [rand].equals ("Rock")) {
			userScore = userScore + 1;
		}
		
		else if(userInput.equals ("Rock") && RPS  [rand].equals ("Scissors")) {
			comScore = comScore + 1;
			}
		
		else if (userInput.equals("Scissors") && RPS  [rand].equals ("Paper")) {
			userScore = userScore + 1;
		}
		
	else {
		System.out.println(" It's a tie ! ");
		}
		
		if (userScore > comScore)
			System.out.println(" user win ");
		
		else  
			System.out.println(" com win");
		
		
	}

}