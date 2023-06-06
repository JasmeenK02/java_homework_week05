package java_homework_week05;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_RetrieveFromArrayList {

    public static void main(String[] args) {
        coloursList();
    }

    public static void coloursList(){

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Orange");
        colours.add("Pink");
        colours.add("White");
        colours.add("Black");

        System.out.println(colours);

        System.out.println("Please enter an index number:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if( index < colours.size()){
            System.out.println(colours.get(index));
        } else{
            System.out.println("Invalid index entered.");
        }

        scanner.close();


    }
}
