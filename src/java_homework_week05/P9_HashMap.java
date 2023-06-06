package java_homework_week05;

import java.util.HashMap;
import java.util.Map;

public class P9_HashMap {

    public static void colours() {


        Map<String, Integer> colourNumber = new HashMap<>();
        colourNumber.put("Red", 1);
        colourNumber.put("Orange", 2);
        colourNumber.put("Pink", 3);
        colourNumber.put("White", 4);
        colourNumber.put("Black", 5);

        for (Map.Entry<String, Integer> colourNum : colourNumber.entrySet()){
            System.out.println(colourNum.getKey() + " = " + colourNum.getValue());
        }
    }

    public static void main(String[] args) {
        colours();
    }
}
