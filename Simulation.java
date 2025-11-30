import java.util.Scanner;
public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "admin";

        System.out.print("Type the password: ");
            String typedPassword = scanner.next();
        

        int attempt = 3 ;
        do { 
            if(typedPassword.equals(correctPassword)){
                System.out.println("Welcome");
            }else{
                if(attempt>0){
                    System.out.println("Wrong password. Try again. You have " + attempt + " left");
                    typedPassword = scanner.next();
                    
                }else{
                    System.out.println("Account locked");
                    
                }attempt--;
            }
        } while (!typedPassword.equals(correctPassword) && (attempt>-1));
    
           
        
    }
}
