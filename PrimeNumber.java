package personal_learning;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 11;
        int temp = 0;
        for (int i = 2; i <= number/2; i++ ) {
            temp = number % i;
            break;
        }
        if (temp != 0)
            System.out.println(number + "is prime");
        else
            System.out.println(number + "not prime");
    }
}
