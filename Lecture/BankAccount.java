public class BankAccount
{
   private double balance;
   private double fee;


   public BankAccount()
   {
      balance=0;
      fee=0;
   }
   public BankAccount(double initialBalance)
   {
      balance=initialBalance;
   }
   public void deposit(double amount)
   {
      balance=balance + amount-fee;
   }
   public void withdraw(double amount)
   {
      balance=balance - amount-fee;
   }
   public void setFee(double amount)
   {
     fee=amount;
   }
   public double getBalance()
   {
      return balance;
   }
}
