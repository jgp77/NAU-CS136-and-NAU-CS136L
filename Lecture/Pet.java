import java.util.Scanner;

class Pet
{
	public static void main(String[] args)
	{
		String pet_name="" ;
		String pet_dob="";
		String pet_type="";
		int pet_created=0;
		while (true)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Would you like to ACCESS a pet, CREATE a new pet, or EXIT?");
			String menu=(input.next()).toUpperCase();
			if (menu.equals("CREATE"))
			{
				System.out.println("Please enter the pet's name: ");
				String name=input.next();
				pet_name=name;
				System.out.println("Please enter the pet's date of birth: ");
				String dob=input.next();
				pet_dob=dob;
				System.out.println("Please enter the pet type: ");
				String type=input.next();
				pet_type=type;
				System.out.println("Pet created!\nReturning to menu...");
				pet_created=1;
			}
			else if (menu.equals("ACCESS"))
			{
				if (pet_created == 0)
				{
					System.out.println("No pet has been created yet!\nReturning to menu...");
				}
				else
				{
					System.out.println("Pet's name: "+pet_name);
					System.out.println("Pet's date of birth: "+pet_dob);
					System.out.println("Pet type: "+pet_type);
					System.out.println("Returning to menu...");
				}
				
			}
			else if (menu.equals("EXIT"))
			{
				System.out.println("Thanks for using the Pet class!\nExiting...");
				break;
			}
			else
			{
				System.out.println("Incorrect input! Please try again!");
			}
		
		}
	}
}