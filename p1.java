import java.util.Scanner;

class p1 {

    public static int countDigits(int a) {
        int count = 0; // Initialize count to 0
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int n, count;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();  // Read integer input

        count = countDigits(n);

        System.out.printf("The number of digits in %d is %d%n", n, count);

        scanner.close();
    }
}
