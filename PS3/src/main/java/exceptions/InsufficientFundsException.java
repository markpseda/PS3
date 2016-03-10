package exceptions;

public class InsufficientFundsException extends Exception
{
   private double amount;
   
   /**
    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
    * @param amount amount of money that was not in account to be withdrawn.
    */
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}