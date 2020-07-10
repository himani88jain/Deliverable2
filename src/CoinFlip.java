import java.util.Random;
import java.util.Scanner;
public class CoinFlip {
	public static String chanceFunc()
	{
		   Random r = new Random();
		   int chance = r.nextInt();
		   if (chance%2==0) 
		   {
			   System.out.println("Tails");
		      return"tails";
		   } else
		   {
			   System.out.println("Heads");
		      return"heads";
		   }
	}
	public static void main(String[] args) {
		System.out.println("Guess which will have more: heads or tails?");
		Scanner scnr=new Scanner(System.in);
		String headsOrTailsGuess=scnr.next();
		boolean b=true;
		while(b==true)
		{
			if(!(headsOrTailsGuess.equalsIgnoreCase("Heads")||headsOrTailsGuess.equalsIgnoreCase("Tails")))
			{
		
			System.out.println("Please enter heads or tails only!!");
			headsOrTailsGuess=scnr.next();
		    continue;
			}
			else
				b=false;
			
		}
		System.out.println("How many times shall we flip a coin? ");
		int heads=0;
		int tails=0;
		int numberOfFlips=0;
		boolean a=true;
		while(a==true)
		{   
	      
			try {
				scnr=new Scanner(System.in);
				numberOfFlips=scnr.nextInt();
				int correctCount=0;
				for(int i=0;i<numberOfFlips;i++)
					{
					String str="";
					str=chanceFunc();
					if(str.equalsIgnoreCase("Heads"))
						heads++;
					if(str.equalsIgnoreCase("Tails"))
						tails++;
					}
		
				float prob = 0;
				if(headsOrTailsGuess.equalsIgnoreCase("Heads")) {
					correctCount=heads;
					prob = (float)((float)heads*100/(float)numberOfFlips);
				}
				else if(headsOrTailsGuess.equalsIgnoreCase("Tails")) {
					correctCount=tails;
					prob = (float)((float)tails*100/(float)numberOfFlips);
				}
				System.out.println("Your guess, "+ headsOrTailsGuess+", came up "+correctCount+" time(s).");
				System.out.println("That's "+prob+" %");
				a=false;
				}	
				catch(Exception e) {
					System.out.println("The number entered is not a valid Integer.Please enter again");
					a=true;
				}
		}	
		scnr.close();
	}
	}
