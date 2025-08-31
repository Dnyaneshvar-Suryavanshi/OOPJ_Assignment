import java.util.Scanner;

public class ExamEligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int held = sc.nextInt();
		int attended = sc.nextInt();
        char mc = sc.next().charAt(0);

        if (held <= 0 || attended < 0 || attended > held) {
            System.out.println("Invalid input");
        } else {
            double percent = attended * 100 / held;
            System.out.println((percent >= 75 || (percent >= 60 && mc == 'Y'))
                    ? "Student is allowed to sit for the exam."
                    : "Student is NOT allowed to sit for the exam.");
        }
    }
}
