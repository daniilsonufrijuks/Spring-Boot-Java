package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return true;
    }

    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard petesCard = new PaymentCard(10);
    
            System.out.println("money " + petesCard.balance());
            boolean wasSuccessful = petesCard.takeMoney(8);
            System.out.println("successfully withdrew: " + wasSuccessful);
            System.out.println("money " + petesCard.balance());
    
            wasSuccessful = petesCard.takeMoney(4);
            System.out.println("successfully withdrew: " + wasSuccessful);
            System.out.println("money " + petesCard.balance());
        }
    }
}