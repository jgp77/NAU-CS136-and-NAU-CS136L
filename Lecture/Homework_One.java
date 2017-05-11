class Homework_One
{
	public static void main(String[] args)
	{
		// Problem 1
		int sum=1+2+3+4+5+6+7+8+9+10;
		System.out.println("Problem 1:\n"+"	Sum of first 10 integers: "+sum+"\n");
		
		// Problem 2
		double balance=1000;
		double interest_balance=balance+(balance * .05);
		System.out.println("Problem 2 (Compounded Annualy):\n"+"	First year interest: "+interest_balance);
		balance=interest_balance;
		interest_balance=balance+(balance * .05);
		System.out.println("	Second year interest: "+interest_balance);
		balance=interest_balance;
		interest_balance=balance+(balance * .05);
		System.out.println(("	Third year interest: "+(Math.round(interest_balance*100.00)/100.00))+"		("+ interest_balance +")");
		balance=1000;
		interest_balance=balance+(balance * .05);
		System.out.println("\nProblem 2 (Simple Interest):\n"+"	First year interest: "+interest_balance);
		interest_balance=interest_balance+(balance *.05);
		System.out.println("	Second year interest: "+interest_balance);
		interest_balance=interest_balance+(balance *.05);
		System.out.println("	Third year interest: "+interest_balance+"\n");
		
		// Problem 3
		System.out.println("Problem 3:");
		balance=10000;
		double interest=.005;
		double count=1;
		while (balance >= 500)
		{
			balance=balance+(balance * interest)-500;
			count+=1;
			System.out.println("	Month "+(int)count+" Balance: " +(Math.round(balance*100.00)/100.00)+"		("+balance+")");
		}
		System.out.println("	Years passed: "+(Math.round(((count/12)*100.00))/100.00)+"		("+(count/12)+")");
	}
}

// I decided to round a few answers. The number in the parenthesis are exact answers, while the displayed answers are rounded approx.