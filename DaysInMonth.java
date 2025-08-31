import java.util.Scanner;

public class DaysInMonth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1 || a > 12) {
            System.out.println("Invalid month number");
        } else if (a == 2) {
            System.out.println("28 or 29 days");
        } else {
            System.out.println((a == 4 || a == 6 || a == 9 || a == 11) ? "30 days" : "31 days");
        }
    }
}




