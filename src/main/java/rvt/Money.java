package rvt;
public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int NEuros = this.euros + addition.euros();
        int NCents = this.cents + addition.cents();
        if (NCents >= 100) {
            NEuros++;
            NCents -= 100;
        }
        // return the new Money object
        Money newMoney = new Money(NEuros, NCents); // create a new Money object that has the correct worth
        return newMoney;
    }

    public boolean lessThan(Money number) {
        boolean flag = true;
        if (this.euros > number.euros()) {
            flag = false;
        } else if (this.euros == number.euros()) {
            if (this.cents > number.cents()) {
                flag = false;
            } else {
                flag = true;
            }
        } else {
            flag = true;
        }
        return flag; 
    }

    public Money minus(Money minus) {
        int NEuros = this.euros - minus.euros();
        int NCents = this.cents - minus.cents();
        if ((this.cents - minus.cents()) < 0) {
            NEuros--;
            NCents = (100 - (minus.cents() - this.cents));
        }
        if ((this.euros - minus.euros()) < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney; 
        }
        Money newMoney = new Money(NEuros, NCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents
         + "e";
    }

    public static void main(String[] args) throws Exception {
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        System.out.println("-------------------------");

        Money a2 = new Money(10, 0);
        Money b2 = new Money(3, 0);
        Money c2 = new Money(5, 0);
        Money d2 = new Money(5, 2);

        System.out.println(a2.lessThan(b2));  // false
        System.out.println(b2.lessThan(c2)); 
        System.out.println(a2.lessThan(c2)); 
        System.out.println(d2.lessThan(c2)); 
        System.out.println(a2.lessThan(d2)); 
        System.out.println(d2.lessThan(a2)); 

        System.out.println("-------------------------");

        Money a3 = new Money(10, 0);
        Money b3 = new Money(3, 50);

        Money c3 = a3.minus(b3);

        System.out.println(a3);  // 10.00e
        System.out.println(b3);  // 3.50e
        System.out.println(c3);  // 6.50e

        c3 = c3.minus(a3);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a3);  // 10.00e
        System.out.println(b3);  // 3.50e
        System.out.println(c3);  // 0.00e
    }
}
