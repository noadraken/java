import java.util.Scanner;
public class Exponential {
    static int expo(int n, int m){
        if (m == 0){
            return 1;
        }return n * expo(n, m-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the base number?: ");
            int n = scanner.nextInt();
        
        System.out.print("What's the exponential power?: ");
            int m = scanner.nextInt(); 
        
        System.out.print("The exponential of " + n + " is "+ expo(n, m));
        
        scanner.close();
        }
    
}
