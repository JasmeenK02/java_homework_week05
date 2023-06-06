package java_homework_week05;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class P4_ArrayColourlist {

    public static void colourList(){

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Orange");
        colours.add("Pink");
        colours.add("White");
        colours.add("Black");

        for(String colourList : colours){
            System.out.println(colourList + ",");
        }
    }

    public static void main(String[] args) {
        colourList();
    }
}
