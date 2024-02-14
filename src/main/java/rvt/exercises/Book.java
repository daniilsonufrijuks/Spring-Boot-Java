package rvt.exercises;

public class Book implements Packable {
    private String author;
    private String bookname;
    private double weight;
    
    public Book(String author, String bookname, double weight) {
        this.author = author;
        this.bookname = bookname;
        this.weight = weight;
    }

    public String toString() {
        return this.author + ": " + this.bookname;  
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
