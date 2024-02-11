package rvt.temp;

public class Alien extends Human{
    private String planet;

    public Alien(String name, int age, String planet) {
        super(name, age);
        this.planet = planet;
    }

    public void SetPlanet(String NewPlanet) {
        this.planet = NewPlanet;
    }

    public String Getplanet() {
        return this.planet;
    }

    public String toString() {
        return super.toString() + " " + this.planet;
    }

}
