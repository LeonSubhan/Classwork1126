package personal_learning;

import java.util.Scanner;

public class StudestGrade {

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int mark = ali.nextInt();
        char grade;
        if (mark >= 90) {
            grade = 'A';
        } else if (mark >= 80 && mark < 89) {
            grade = 'B';
        } else if (mark >= 70 && mark < 79) {
            grade = 'C';
        } else if (mark >= 60 && mark < 69) {
            grade = 'D';
        } else {
            grade = 'D';
        }
        switch (grade) {
            case 'A':
                System.out.println("Nice");
                break;
            case 'B':
                System.out.println("Need work");
                break;
            case 'C':
                System.out.println("you passed");
                break;
            case 'D':
                System.out.println("Get out of class");
                break;
            case 'F':
                System.out.println("You failed");
                break;
            default:
                System.out.println("Invalid grade");

        }
        System.out.println("Your grade is :" + grade);
    }
}
