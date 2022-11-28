package personal_learning;

import java.util.Scanner;

//Write a Java method to check whether a
// string is a valid password. Password
// rules: A password must have at least
// ten characters. A password consists
// of only letters and digits. A password
// must contain at least two digits.
public class WorkSession1117 {
    public static int password_length = 10;
    public static boolean valid_password(String password) {
        if (password.length() < password_length)
            return false;
        int str_count = 0;
        int int_count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_int(ch)) int_count++;
            else if (is_char(ch)) int_count++;
            else return false;

            }
        return (int_count >= 2 && str_count >= 2);
    }

    public static boolean is_char(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_int(char ch){
        return (ch >= '0' && ch <= '9');
    }
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter you password.");
        String user_password = ali.nextLine();
        System.out.println("Your password is: " + user_password);
        if (valid_password(user_password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }
    }

