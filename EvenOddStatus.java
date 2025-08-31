import java.util.Scanner;

class EvenOddStatus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0)
            System.out.println("Both numbers are even");
        else if (n1 % 2 != 0 && n2 % 2 != 0)
            System.out.println("Both numbers are odd");
        else
            System.out.println("Numbers are mixed- even and odd");
    }
}
