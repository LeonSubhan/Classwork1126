package personal_learning;

import java.util.Scanner;

public class FindAsci {

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter you char to find the ASCI (American Standard Code for Information Interchange)");
        char ch = ali.next().charAt(0);
        int asci = ch;

        System.out.println("The ASCI of " +ch+ "is: " +asci);


    }
}
