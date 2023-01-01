package mate.academy;

public class BankAccount {
   private double amount = 0;

   public double getAmount() {
       return amount;
   }

   public void acceptAmount(int amount) {
       if(amount <= 0) {
           System.out.println("Amount should be greater than 0");
           return;
       }
       this.amount += amount;
   }
}
