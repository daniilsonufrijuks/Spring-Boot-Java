package rvt.exercises;

import java.util.ArrayList;

public class Box implements Packable{
    private int cap;
    private ArrayList<Packable> items;

    public Box(int cap) {
        this.cap = cap;
        this.items = new ArrayList<>();
    }

    public void add(Packable obj) {
        if (!(this.cap < this.weight() + obj.weight())) {
            this.items.add(obj);
        }
    }

    public String toString() {
        return "Box:" + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : this.items) {
            weight += packable.weight();
        }
        return weight;
    }

}
