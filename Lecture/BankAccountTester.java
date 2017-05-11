public class BankAccountTester
{
   public static void main(String[] args)
   {
     BankAccount bank1=new BankAccount(4000);
     BankAccountMonthly bank2= new BankAccountMonthly(4000,20,2);
     //Month 1
     System.out.println("\nBank 1:");
     bank1.setFee(2);
     bank1.deposit(500);
     System.out.println(bank1.getBalance());
     bank1.withdraw(250);
     System.out.println(bank1.getBalance());
     System.out.println("\nBank 2:");
     bank2.deposit(500);
     System.out.println(bank2.getBalance());
     bank2.withdraw(250);
     System.out.println(bank2.getBalance());
     bank2.withdraw(750);
     System.out.println(bank2.getBalance());
     bank2.deductMonthlyCharge();
     System.out.println(bank2.getBalance());
     //Month 2
     System.out.println("\nBank 1:");
     bank1.setFee(15);
     bank1.deposit(700);
     System.out.println(bank1.getBalance());
     bank1.withdraw(220);
     System.out.println(bank1.getBalance());
     System.out.println("\nBank 2:");
     bank2.deposit(50);
     System.out.println(bank2.getBalance());
     bank2.withdraw(70);
     System.out.println(bank2.getBalance());
     bank2.deductMonthlyCharge();
     System.out.println(bank2.getBalance());
   }
}
