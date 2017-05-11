import java.util.*;

class PetCreation
{
	public static void main(String[] args)
	{
		Pet pet1=new Pet();
		Pet pet2=new Pet();
		Scanner input=new Scanner(System.in);
		//Creates 2 pets and a scanner
		System.out.println("Enter a pet name: ");
		String name1=input.nextLine();
		System.out.println("Enter the pet's date of birth: ");
		String dob1=input.nextLine();
		System.out.println("Enter the pet's type: ");
		String type1=input.nextLine();
		//Asks for first pet's information		
		pet1.setName(name1);
		pet1.setDOB(dob1);
		pet1.setType(type1);
		//Sets first pet's information
		System.out.println("Enter a pet name: ");
		String name2=input.nextLine();
		System.out.println("Enter the pet's date of birth: ");
		String dob2=input.nextLine();
		System.out.println("Enter the pet's type: ");
		String type2=input.nextLine();
		//Asks for second pet's information
		pet2.setName(name2);
		pet2.setDOB(dob2);
		pet2.setType(type2);
		//Sets second pet's information
		System.out.println("Pets:");
		System.out.println(pet1.getName());
		System.out.println(pet1.getDOB());
		System.out.println(pet1.getType()+"\n");
		System.out.println(pet2.getName());
		System.out.println(pet2.getDOB());
		System.out.println(pet2.getType());
		//Prints both pet's information		
	}
}