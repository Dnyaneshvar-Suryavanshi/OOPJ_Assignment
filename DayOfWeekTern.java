import java.util.Scanner;

class DayOfWeekTern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number: ");
        int d = sc.nextInt();
        String day = d==1?"Monday":d==2?"Tuesday":d==3?"Wednesday":d==4?"Thursday":d==5?"Friday":d==6?"Saturday":d==7?"Sunday":"Invalid";
        System.out.println("Day is " + day);
    }
}




