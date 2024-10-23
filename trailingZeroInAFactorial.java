import java.util.Scanner;

public class trailingZeroInAFactorial {
    public static int factorial(int n) {
        int fact = 1;  // Start fact with 1, but forlage vaue of n it will create issue for calcultion of factorial as int data type storage is limited
        int temp = n;
        while (temp > 1) {
            fact *= temp;  // Multiply by temp
            temp--;  // Decrement temp
        }
        return fact;
    }
    
        // or we can simply run a for loop from i=2 to n and multiply each iteration to give factotial
        // or we can aso use recursion with the logic n*fact(n-1) and return when n == 1
    
    public static int trailingZero(int n){
        int count=0;
        while(n%10 == 0){
            n=n/10;
            count++;
        }
        return count;
    }

    // second method : counting 5s in the given number
    public static int trailingZero2(int n){
        int res=0;
       for(int i = 5; i<=n;i=i*5){
        res = res + n/i;
       }
        return res;
    }

    public static void main (String args[]){
        int n;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();  //Read integer input
        System.out.println(trailingZero(factorial(n)));
        System.out.println(trailingZero2(n));
    }   
}
