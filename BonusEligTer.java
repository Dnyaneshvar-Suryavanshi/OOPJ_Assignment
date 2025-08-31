import java.util.*;
class BonusEligTer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int service = sc.nextInt();
		
        double bonus = (service > 5) ? (0.05 * salary) : 0;
        System.out.println("Bonus: " + bonus);

    }
}





