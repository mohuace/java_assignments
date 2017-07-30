import java.util.Random;
import java.util.Scanner;
public class numberguesser{
	public static void main(String args[]){
		Random rand=new Random();
		int randomNumber = rand.nextInt(10) + 1;
		int count=1;
		System.out.println("Hey i have number in my mind from 1-10...guess the number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while(a!=randomNumber){
			System.out.println("Wrong! Try again!");
			a = scan.nextInt();
			count++;

		}
		System.out.println("Yay you got the number..the number of guesses it took is:"+count);
		if(count<5)
			System.out.println("That's better than average");
		else
			System.out.println("You were below average :(");






	}
		}

