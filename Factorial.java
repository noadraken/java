import java.util.Scanner;
public class Factorial {
    static int facto(int n){
        if(n >1){
            return n * facto(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your number?: ");
        int n = scanner.nextInt();
        int m = facto(n);
        System.out.print("The factorial of " + n + " is " + m);
        scanner.close();
    }

    
    
}
