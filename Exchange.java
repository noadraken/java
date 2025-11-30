import java.util.Scanner;
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Payment -");
        double totalPayment = scanner.nextInt();

        System.out.print("Money- ");
        double money = scanner.nextInt();

        

        if(totalPayment > 50000 && totalPayment < 200000){
            totalPayment = totalPayment - (totalPayment*0.1);  //Means 10% discount
        }else if(totalPayment > 200000){
            totalPayment = totalPayment - (totalPayment*0.2);  //Means 20% discount
        }else{
            totalPayment = totalPayment;
        }

        double exchange = money - totalPayment;
        System.out.print(exchange);

        scanner.close();
    }
}
