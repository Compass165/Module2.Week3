package TriangleClassifier;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh dau tien");
        double side1 = scanner.nextDouble();
        System.out.println("nhap canh thu 2");
        double side2 = scanner.nextDouble();
        System.out.println("nhap canh cuoi cung");
        double side3 = scanner.nextDouble();
        TriangleClassifier checkTrangle = new TriangleClassifier(side1,side2,side3);
        System.out.println(checkTrangle.showTriangleIs());
    }
}
