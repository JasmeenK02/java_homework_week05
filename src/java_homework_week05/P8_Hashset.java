package java_homework_week05;

import java.util.HashSet;

public class P8_Hashset {

    public static void hashSetNumbers(){

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for( int i = 1; i<= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " is in the set.");
            } else{
                System.out.println(i + " is not in the set");
            }
        }
    }

    public static void main(String[] args) {
        hashSetNumbers();
    }
}
