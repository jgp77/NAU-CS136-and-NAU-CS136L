import java.util.*;

public class LotteryPrinter
{
  public static void main(String[] args)
  {
	System.out.println("Please enter 5 numberArray less than or equal to 10:");
	Scanner input=new Scanner(System.in);
	// Creates a scanner named input
	Random rand =new Random();
	//creates a random named rand
	int usernum1=input.nextInt();
	// asks for user input
	while(true) // checks for correct input
	{
		if ((usernum1 > 10)||(usernum1 <0))
		{
			System.out.println("Incorrect input. Try again");
			usernum1=input.nextInt();
		}
		else
		{
			break;
		}
	}
	int usernum2=input.nextInt();
	// asks for user input
	while(true)//Checks for correct user input
	{
		if ((usernum2 > 10)||(usernum1 <0))
		{
			System.out.println("Incorrect input. Try again");
			usernum2=input.nextInt();
		}
		else
		{
			break;
		}
	}
	int usernum3=input.nextInt();
	// asks for user input
	while(true)//Checks for correct user input
	{
		if ((usernum3 > 10)||(usernum1 <0))
		{
			System.out.println("Incorrect input. Try again");
			usernum3=input.nextInt();
		}
		else
		{
			break;
		}
	}
	int usernum4=input.nextInt();
	// asks for user input
	while(true)//Checks for correct user input
	{
		if ((usernum4 > 10)||(usernum1 <0))
		{
			System.out.println("Incorrect input. Try again");
			usernum4=input.nextInt();
		}
		else
		{
			break;
		}
	}
	int usernum5=input.nextInt();
	// asks for user input
	while(true)//Checks for correct user input
	{
		if ((usernum5 > 10)||(usernum1 <0))
		{
			System.out.println("Incorrect input. Try again");
			usernum5=input.nextInt();
		}
		else
		{
			break;
		}
	}
	System.out.println("Your numberArray are: "+usernum1+" "+usernum2+" "+usernum3+" "+usernum4+" "+usernum5);
	int num1=rand.nextInt(10)+0;
	int num2=rand.nextInt(10)+0;
	int num3=rand.nextInt(10)+0;
	int num4=rand.nextInt(10)+0;
	int num5=rand.nextInt(10)+0;
	//Creates 5 random numberArray set to num#
	System.out.println("Winning numberArray are: "+num1+" "+num2+" "+num3+" "+num4+" "+num5);
	if (usernum1 == num1 && usernum2==num2 && usernum3==num3 && usernum4==num4 && usernum5==num5) //Checks to see if user won
	{
		System.out.println("You Won!");
	}
	else
	{
		System.out.println("Better luck next time!");
	}
  }
}