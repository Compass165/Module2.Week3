package powerpoint;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Moi nhap b: ");
        int b = scanner.nextInt();
        int ADDITION = a + b;
        System.out.println(ADDITION);

        System.out.println("Moi nhap c: ");
        int c = scanner.nextInt();
        System.out.println("Moi nhap d: ");
        int d = scanner.nextInt();
        int SUBTRACTION = c - d;
        System.out.println(SUBTRACTION);

        System.out.println("Moi nhap e: ");
        int e = scanner.nextInt();
        System.out.println("Moi nhap f: ");
        int f = scanner.nextInt();
        int MULTIPLICATION = e * f;
        System.out.println(MULTIPLICATION);

        System.out.println("Moi nhap g: ");
        int g = scanner.nextInt();
        System.out.println("Moi nhap h: ");
        int h = scanner.nextInt();
        int DIVISION = g / h;
        System.out.println(DIVISION);

    }

    public static void m1(int firstNumber, int secondNumber) {

    }

}
