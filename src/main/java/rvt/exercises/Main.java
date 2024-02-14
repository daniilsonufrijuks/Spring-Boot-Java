package rvt.exercises;

import java.util.ArrayList;

public class Main {

    // public static void printPersons(ArrayList<Person> persons) {
    //     for (Person person : persons) {
    //         System.out.println(person);
    //     }
    // }
    // public static void main(String[] args) {
    // ArrayList<Person> persons = new ArrayList<Person>();
    // persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    // persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    // printPersons(persons);
    //}
    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);


        System.out.println();

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
