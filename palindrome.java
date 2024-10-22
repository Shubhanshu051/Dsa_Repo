import java.util.Scanner;

class palindrome {
    public static boolean isPalindrome(int n) {
        int revNum = 0;
        int digit;
        int temp = n;
        while(temp > 0) {
            digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }
        return n == revNum;
    }

    public static void main(String args[]) {
        int n;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();  // Read integer input
        
        if (isPalindrome(n)) {
            System.out.printf("%d is a palindrome\n", n);
        } else {
            System.out.printf("%d is not a palindrome\n", n);
        }
    }
}
