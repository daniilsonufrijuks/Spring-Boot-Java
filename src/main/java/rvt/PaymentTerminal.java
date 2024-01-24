package rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public class MainProgram {
        public static void main(String[] args) {
            PaymentTerminal unicafeExactum = new PaymentTerminal();
    
            double change = unicafeExactum.eatAffordably(10);
            System.out.println("remaining change " + change);
    
            change = unicafeExactum.eatAffordably(5);
            System.out.println("remaining change " + change);
    
            change = unicafeExactum.eatHeartily(4.3);
            System.out.println("remaining change " + change);
    
            System.out.println(unicafeExactum);
        }
    }
}