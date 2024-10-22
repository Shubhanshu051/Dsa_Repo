import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        int temp = n;
        int fact = n;
        while(temp>1){
            fact = fact *(temp-1);
            temp--;
        }
        return fact;
    }
    public static void main (String args[]){
        int n;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();  //Read integer input
        System.out.println(factorial(n));

    }
}
