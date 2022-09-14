package studio2;

import java.util.Scanner;

public class Ruin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner betting = new Scanner(System.in);
		//System.out.println("Input start amount");
		//startAmount = betting.nextDouble();

		double startAmount;
		double winChance;
		int winLimit;
		int totalSimulations;

		Scanner betting = new Scanner(System.in);

		System.out.println("Input start amount");
		startAmount = betting.nextDouble();

		System.out.println("Input win chance");
		winChance = betting.nextDouble();

		System.out.println("Input win limit");
		winLimit = betting.nextInt();

		System.out.println("Input total simulation number");
		totalSimulations = betting.nextInt();

		double count = startAmount;
		int success = 0;
		int ruin = 0;
		int day = 0;

		for (int i = 0; i < totalSimulations; i++) {

			while (count < winLimit && count > 0)
			{
				if (winChance > Math.random())
				{
					count ++;
				}	
				else 
				{
					count--;
				}
				if (count == 0)
				{
					ruin++;
				}
				else
				{
					success++;
				}
				
			}
			day++;
			
			System.out.println("Your total amount is " + "$" + count);
			System.out.println("You are on day " + day); 
			System.out.println("You ran " + success + ruin + " simulations");

		}


		if (count == 0) 
		{
			System.out.println("Your day ended in ruin :((((((");
		}
		else 
		{
			System.out.println("Your day ended in happiness and fortune! :D");
		}

	}

}