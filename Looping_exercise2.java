public class Looping_exercise2 {
    public static void main(String[] args) {
        int diff1 = 4;
        int result = 6;

        System.out.print("\n" + result + " ");
        for(int diff2 = -5; diff2 >= -9; diff2--){
            result += diff1;
            System.out.print(result + " ");
            result += diff2;
            System.out.print(result + " ");
            diff1+= 2;
            
            diff2--;
        }
    }
}