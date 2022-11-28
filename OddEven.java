package personal_learning;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = ali.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
