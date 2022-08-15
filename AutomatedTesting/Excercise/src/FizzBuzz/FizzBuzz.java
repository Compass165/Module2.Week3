package FizzBuzz;

public class FizzBuzz {

    static boolean limitNumber(int number){
        return number > 0 && number < 100;
    }
    static String checkFizzBuzz(int number){
        if (limitNumber(number)){
            if (number % 15 == 0)
                return "FizzBuzz";
            else if (number% 3 == 0)
                return "Fizz";
            else if (number % 5 ==0)
                return "Buzz";
            else return readNumber(number/10) + " " + readNumber(number%10);
        }
        else return "khong dem duoc";
    }
    static String readNumber(int number){
        return switch (number) {
            case 1 -> "mot";
            case 2 -> "hai";
            case 3 -> "ba";
            case 4 -> "bon";
            case 5 -> "nam";
            case 6 -> "sau";
            case 7 -> "bay";
            case 8 -> "tam";
            case 9 -> "chin";
            case 0 -> "muoi";
            default -> "sai";
        };
    }
}
