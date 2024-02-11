package rvt.temp;

public class Main {
    public static void main(String[] args) {
        // Counter counter = new Counter();
        // Counter superCounter = new SuperCounter();
        // int number = 3;
        // number = superCounter.subtractFromNumber(number);
        // number = superCounter.subtractFromNumber(number);
        // number = counter.addToNumber(number);
        // System.out.println(number);

        Human human = new Human("Alan", 17);
        System.out.println(human);
        human.SetName("Nick");
        human.SetAge(18);
        System.out.println(human);
        //System.out.println(human.GetName());
        System.out.println(human.GetAge());
        System.out.println(human.OldEnough());
        Alien alien = new Alien("Jhon", 1000, "Mars");
        System.out.println(alien);
        System.out.println(alien.Getplanet());
        alien.SetPlanet("Neptun");
        System.out.println(alien);
    }
}
