package personal_learning;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter you first number: ");
        int first_number = ali.nextInt();
        System.out.println("Enter your second number: ");
        int second_number = ali.nextInt();
        System.out.println("---------Before Swap -------");
        System.out.println("The first number is: " +first_number);
        System.out.println("And the second number is: " +second_number);
        int temp = first_number;
        first_number = second_number;
        second_number = temp;
        System.out.println("--------------After the Swap---------------");
        System.out.println("The first number is: " +first_number);
        System.out.println("And the second number is: " +second_number);
    }
}
