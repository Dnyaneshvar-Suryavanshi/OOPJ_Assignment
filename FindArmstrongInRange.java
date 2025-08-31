class FindArmstrongInRange {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            int num = i; 
			int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem * rem * rem;
                num /= 10;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
    }
}







