import java.util.*;
class DiscountUsingTer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
		
        double total = (amount >= 1000) ? (amount - (0.10 * amount)) : amount;
        System.out.println("Total cost after discount: " + total);

    }
}





