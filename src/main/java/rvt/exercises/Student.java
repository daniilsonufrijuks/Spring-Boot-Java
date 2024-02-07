package rvt.exercises;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return this.credits;
    }

    public int study() {
        return this.credits += 1;
    }

    public String toString() {
        return this.getName() + "\n" + "  " + this.getAddress() + "\n" + "  Study credits "+ this.credits();
    }
    public static void main(String[] args) throws Exception {
        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // System.out.println(ollie);
        // System.out.println("Study credits " + ollie.credits());
        // ollie.study();
        // System.out.println("Study credits "+ ollie.credits());
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }
}
