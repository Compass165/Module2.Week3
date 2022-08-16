package nextdaycalculator;

public class NextDayCalculator {

    public static final String space = "/";

    public static String nextDay(int day, int month, int year) {
        int equal31days = 31;
        int equal30days = 30;
        int equal28or29days = 28;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == equal31days)
                    return 1 + space +(month + 1) + space + year;
            case 12:
                if (day == equal31days)
                    return 1 + space + 1 + space + (year+1);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == equal30days)
                    return 1 + space + (month + 1) + space + year;
            case 2:
                if (day == equal28or29days)
                    return 1 + space + (month +1) + space + year;
                break;
            default:
                return (day + 1) + space + month + space + year;
        }
        return (day+1) + space + month + space +year;
    }

}
