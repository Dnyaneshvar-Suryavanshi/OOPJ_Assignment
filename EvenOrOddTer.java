import java.util.*;
class EvenOrOddTer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "Number is Even" : "Number is Odd");
    }
}





