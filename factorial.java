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
        // or we can simply run a for loop from i=2 to n and multiply each iteration to give factotial
        // or we can aso use recursion with the logic n*fact(n-1) and return when n == 1
    }
    public static void main (String args[]){
        int n;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();  //Read integer input
        System.out.println(factorial(n));

    }
}
