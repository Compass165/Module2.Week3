package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("enter the string to check: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Queue queue = new LinkedList();
        extracted(inputString, queue);
    }

    private static void extracted(String inputString, Queue queue) {
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        reverseString = getString(queue, reverseString);
        if(inputString.equals(reverseString)) {
            System.out.println("This is a symmetric string");
        }
        else {
            System.out.println("This is not a symetric string");
        }
    }

    private static String getString(Queue queue, String reverseString) {
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        return reverseString;
    }
}
