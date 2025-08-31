import java.util.Scanner;

class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num, sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}






