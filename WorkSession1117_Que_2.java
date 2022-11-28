package personal_learning;

import java.util.Scanner;

//Write a Java program that prints "All
// numbers are equal" if all three numbers
// are equal, "All numbers are different" if
// all three numbers are different and "Neither
// all are equal or different" otherwise.
public class WorkSession1117_Que_2 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first_number = ali.nextInt();
        System.out.println("Enter your second number: ");
        int second_number = ali.nextInt();
        System.out.println("Enter your third number: ");
        int third_number = ali.nextInt();

        if (first_number == second_number && first_number == third_number){
            System.out.println("All numbers are equal");
        }
        else if ((first_number != second_number) && (first_number != third_number) && (second_number != third_number)){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
