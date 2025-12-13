import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class PrintCalendar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month){
        Calendar calendar = new GregorianCalendar(year, month, 01);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        printMonthTitle(year, month);

        String initialSpace = "";
        for (int i = 0; i < dayOfWeek - 1; i++){
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++){
            for(int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++){
                System.out.printf("  %2d", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }
    }

    public static void printMonthTitle(int year, int month){
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

}
