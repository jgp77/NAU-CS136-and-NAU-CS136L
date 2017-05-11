public class BankAccountMonthly
{
   private double balance;
   private double monthfee;
   private int numfreeallot;
   private int transcount;

   public BankAccountMonthly(double initialBalance, double monthlyfee, int FreeAllotment)
   {
      balance=initialBalance;
      monthfee=monthlyfee;
      numfreeallot=FreeAllotment;
      transcount=0;
   }
   public void deposit(double amount)
   {
      balance=balance+amount;
      transcount+=1;
   }
   public void withdraw(double amount)
   {
      balance=balance-amount;
      transcount+=1;
   }
   public void deductMonthlyCharge()
   {
      if (numfreeallot<transcount)
      {
        System.out.println("User passed free transaction allotment. Deducting fee.");
        balance-=monthfee;
        transcount=0;
      }
      else
      {
        transcount=0;
        System.out.println("User did not pass free transaction allotment. Not deducting fee.");
      }
   }

   public double getBalance()
   {
      return balance;
   }
}
