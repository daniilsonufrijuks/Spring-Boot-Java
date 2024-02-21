package rvt.temp;

import java.util.ArrayList;

public class TestJavaMooc {
    static void uzd1() {
        ArrayList<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");
    
        String connectedString = "";
        for (int i = 0; i < words.size(); i++) {
            connectedString = connectedString + words.get(i);
        }
        System.out.println(" :" + connectedString);
    }

    static void uzd2() {
        ArrayList<String> words= new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        StringBuilder connectedString = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            connectedString.append(words.get(i));
        }
        System.out.println(" :" + connectedString.toString());
    }

    public static void main(String[] args) {
        uzd1();
        System.out.println();
        uzd2();
    }
}
