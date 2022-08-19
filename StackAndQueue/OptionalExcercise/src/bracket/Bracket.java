package bracket;

import java.util.Scanner;

public class Bracket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Muon nhap chuoi gi? ");
        String str = sc.nextLine().trim();

        String[] strArr = str.split("");

        int count = 0;
        int count1 = 0;
        for (String s:
             strArr) {
            if(s.equals("(")) {
                count++;
            } else if (s.equals(")")) {
                count1++;
            }
        }
        if (count == count1) {
            System.out.println("Enough ()");
        } else
            System.out.println("Not Enough()");
    }

}
