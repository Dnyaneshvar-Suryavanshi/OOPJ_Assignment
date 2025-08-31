import java.util.Scanner;

public class Divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean divisible = false;

        if (n % 2 == 0) { System.out.println("Divisible by 2"); divisible = true; }
        if (n % 3 == 0) { System.out.println("Divisible by 3"); divisible = true; }
        if (n % 5 == 0) { System.out.println("Divisible by 5"); divisible = true; }

        if (!divisible) System.out.println("Not divisible by 2, 3, or 5");
    }
}





