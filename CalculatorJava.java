package personal_learning;

import java.util.Scanner;

public class CalculatorJava {
    public static void main(String[] args) {
        int first_number;
        int second_number;
        String operation;

        Scanner ali = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        first_number = ali.nextInt();
        System.out.println("Enter your second number: ");
        second_number = ali.nextInt();
        System.out.println("Select your operation: ");
        operation = ali.next();


        CalculatorJava cl = new CalculatorJava();

        if (operation.equals("+"))
        {
            System.out.println(cl.add(first_number,second_number));
        }
        else if  (operation.equals("-"))
        {
            System.out.println(cl.deduct(first_number,second_number));
        }
        else if (operation.equals("*"))
        {
            System.out.println(cl.multiply(first_number, second_number));
        }
        else if (operation.equals("/"))
        {
            System.out.println(cl.divide(first_number,second_number));
        }
        else
        {
            System.out.println("Wrong operation");
        }
        {

        }
    }

    public int add (int first_number, int second_number){
        int answer = first_number + second_number;
        return answer;
    }
    public int deduct (int first_number, int second_number) {
        int answer = first_number - second_number;
        return answer;
    }
    public int multiply (int first_number, int second_number){
        int answer = first_number * second_number;
        return answer;
    }
    public int divide (int first_number, int second_number){
        int answer = first_number / second_number;
        return answer;
    }

}
