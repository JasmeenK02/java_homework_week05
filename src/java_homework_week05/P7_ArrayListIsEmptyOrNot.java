package java_homework_week05;

import java.util.ArrayList;

public class P7_ArrayListIsEmptyOrNot {

    public static void isEmpty(){

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Orange");
        colours.add("Pink");
        colours.add("White");
        colours.add("Black");

        System.out.println("The list of Array is:" + colours);

        if (colours.isEmpty()){
            System.out.println("Array list is empty.");
        } else {
            System.out.println("Array list is not empty");
        }

    }

    public static void main(String[] args) {
        isEmpty();
    }
}
