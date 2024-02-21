package rvt.exercises;

public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String description;

    private Education(String desciption) {
        this.description = desciption;
    }

    public String getLevel() {
        return this.description;
    }
}
