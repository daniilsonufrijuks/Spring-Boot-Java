package rvt.exercises;

public class Person {
    private String name;
    //private String address;
    private Education education;

    public Person(String name,Education education) {
        this.name = name;
        //this.address = address;
        this.education = education;
    }

    public String getName() {
        return this.name;
    } 

    // public String getAddress() {
    //     return this.address;
    // }\

    public Education getEducation() {
        return this.education;
    }

    public String toString() {
        return this.name + "\n" + "  " + this.education.getLevel(); // this.address
    }

    // public static void main(String[] args) throws Exception {
    //     Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
    //     Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
    //     System.out.println(ada);
    //     System.out.println(esko);
    // }

    public static void main(String[] args) throws Exception {
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
    }
}
