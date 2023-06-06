package java_homework_week05;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class P5_ArrayListWithIterater {

    public static void coloursList(){

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Pink");
        colours.add("White");
        colours.add("Black");

        ListIterator<String> iterator = colours.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + ",");
        }
    }

    public static void main(String[] args) {
        coloursList();
    }
}
