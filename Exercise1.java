public class Exercise1 {
    public static void main(String[] args) {
        int b = 6;
        int c = -4;
        System.out.print(b + " ");
        for(int a = 5;a<13;a=a+2){
            
            b = b+c;
            c-=2;
            System.out.print(b + " ");
            b = b+a;
            System.out.print(b + " ");
        }
    }
}
