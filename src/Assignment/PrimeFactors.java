package Assignment;

import java.util.Scanner;

public class PrimeFactors {

    public static Boolean isPrime(int number) {
        for(int i=2; i<Math.sqrt(number); i++) {
            if (number%i ==0) {
                return false;
            }
        }
        return true;
    }

    public static int primeFactors(int number) {
        if (isPrime(number)) {
            System.out.println("Empty");
            return 0;
        }

        for(int i=2; i<number/2; i++) {
            if(isPrime(i) && number%i == 0 && number%i != 1) {
                System.out.print(i + ", ");
            }
        }

        return 0;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        primeFactors(number);
    }
}
