import java.util.Scanner;
public class CalendarDisplay {
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        printCalendar(month, year);
    }
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static String getMonthName(int month) {
        if (month < 1 || month > 12) {
            return "Invalid Month";
        }
        return MONTHS[month - 1];
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return 0;
        }
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // Day of month
        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }
}
