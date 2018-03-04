package Assignment;

public class FizzBuzz {
    public static void fizzBuzz(int number) {
        if (number%3 ==0 && number%5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number%3 == 0) {
            System.out.println("Fizz");
        } else if (number%5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    public static void main(String [] args) {
        int number = 100;
        for(int i=1; i<=100; i++) {
            fizzBuzz(i);
        }
    }
}
