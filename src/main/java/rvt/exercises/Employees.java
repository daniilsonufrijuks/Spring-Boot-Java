package rvt.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> items;

    public Employees() {}

    public void add(Person personToAdd) {
        items.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        items.addAll(peopleToAdd);
    }

    public void print() {
        // for (Person person : items) {
        //     System.out.println(person);
        // }   
        Iterator<Person> iterator = items.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = items.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator.next());
            }
        } 
    }
}
