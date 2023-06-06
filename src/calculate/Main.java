package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter first number : ");
            int a = scanner.nextInt();
            System.out.println("Enter second number : ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/ :");
            char symbol = scanner.next().charAt(0);

            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);

            System.out.println("Would you like to do more calculation, Please enter “Y” or “N” :");

            answer = scanner.next().toLowerCase();
            } while (answer.startsWith("y"));

        scanner.close();


        }
    }



