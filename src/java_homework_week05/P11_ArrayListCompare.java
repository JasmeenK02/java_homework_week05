package java_homework_week05;

import java.util.ArrayList;

/**
 * 11. Declare following two arraylist and compare it.
 * ArrayList<String> c1 = new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("Red");
 * c1.add("Pink");
 * ArrayList<String> c2 = new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class P11_ArrayListCompare {

    public static void compareArray(){

        ArrayList<String> c1 = new ArrayList<>();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("Red");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<>();
        for(String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");

        System.out.println(c3);

    }
}
