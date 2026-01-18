import java.util.Scanner;
public class Largest_number_finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your first number: ");
        int no1 = scanner.nextInt();

         System.out.print("Type your second number: ");
        int no2 = scanner.nextInt();

         System.out.print("Type your third number: ");
        int no3 = scanner.nextInt();

         System.out.print("Type your fourth number: ");
        int no4 = scanner.nextInt();

        if (no1 > no2 && no1 > no3 && no1> no4){
            System.out.print(no1 +" is the Largest number");
        }else if (no2 > no1 && no2 > no3 && no2> no4){
            System.out.print(no2 +" is the Largest number");
        }else if (no3 > no1 && no3 > no2 && no3> no4){
            System.out.print(no3 +" is the Largest number");
        }else if (no4 > no1 && no4 > no3 && no4> no2){
            System.out.print(no4 +" is the Largest number");
        }else if(no1 == no2 || no1==no3 || no1==no4){
            System.out.print(no1 + " is the Largest number");
        }else if(no2 == no1 || no2==no3 || no2==no4){
            System.out.print(no2 + " is the Largest number");
        }else if(no3 == no2 || no3==no1 || no3==no4){
            System.out.print(no3 + " is the Largest number");
        }else if(no4 == no2 || no4==no3 || no4==no1){
            System.out.print(no4 + " is the Largest number");
        }
        scanner.close();

       
    } 
}
