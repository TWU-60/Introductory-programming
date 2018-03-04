package Assignment;

import java.util.Scanner;

public class TriangleExercises {

    public static void start() {
        System.out.println("*"); // println会换行
    }

    public static void horizontalLine(int length) {
        while (length > 0) {
            System.out.print("*");
            length--;
        }
        System.out.println();
    }

    public static void verticalLine(int height) {
        while (height > 0) {
            System.out.println("*");
            height--;
        }
    }

    public static void rightTriangle(int height) {
        for(int i=1; i<=height; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        System.out.println("Easiest exercise ever");
        start();
        Scanner scnner = new Scanner(System.in);
        System.out.println("Enter length of line, Draw a horizontal line: ");
        int length = scnner.nextInt();
        horizontalLine(length);
        System.out.println("Enter height of line, Draw a vertical line: ");
        int verticalLineHeight = scnner.nextInt();
        verticalLine(verticalLineHeight);
        System.out.println("Enter height of line, Draw a right triangle: ");
        int triangleHeight = scnner.nextInt();
        rightTriangle(triangleHeight);
    }
}