package Assignment;

import java.util.Scanner;

public class DiamondExercises {

    public static void aboveTri(int number) {
        for(int i=1; i<number; i++) {
            for(int j=number-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<2*i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void belowTri(int number) {
        for(int i=number-1; i>0; i--) {
            for(int j=number-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int k=2*i-1; k>0; k-- ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void midInTri(int number) {
        for(int i=1; i<=number*2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void centerTri(int number) {
        aboveTri(number);
        midInTri(number);
    }
    
    public static void centerDiamond(int number) {
        aboveTri(number);
        midInTri(number);
        belowTri(number);
    }

    public static void diamondWithName(int number) {
        aboveTri(number);
        System.out.println("Tao");
        belowTri(number);
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a number n, print a centered triangle: ");
        int centeredTri = scanner.nextInt();
        centerTri(centeredTri);
        System.out.println("Given a number n, print a centered diamond: ");
        int centeredDiamond = scanner.nextInt();
        centerDiamond(centeredDiamond);
        System.out.println("Given a number n, print a centered diamond with your name in place of the middle line: ");
        int namedDiamond = scanner.nextInt();
        diamondWithName(namedDiamond);
    }
}