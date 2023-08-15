package score;

import java.util.Scanner;

public class scoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the score");
		int score =scan.nextInt();
		grade g= new grade();
		g.givengrade(score);
		
		

	}

}
