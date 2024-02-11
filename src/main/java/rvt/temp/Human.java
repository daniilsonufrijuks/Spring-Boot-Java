package rvt.temp;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void SetName(String NewName) {
        this.name = NewName;
    }

    public void SetAge(int NewAge) {
        this.age = NewAge;
    }

    public String GetName() {
        return this.name;
    }

    public int GetAge() {
        return this.age;
    }

    public boolean OldEnough() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "-> " + this.name + " " + this.age;
    }
}
