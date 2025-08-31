import java.util.Scanner;

public class Q18_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int d = sc.nextInt();

        String dayName;
        switch (d) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = null;
        }

        if (dayName == null) {
            System.out.println("Invalid day number");
        } else {
            System.out.println("Day is " + dayName);
        }
    }
}





