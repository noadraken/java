public class Exercise2 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        for (int i =0; i<2; i++){
            System.out.println();
                for (int j = 0; j<4;j++){
                System.out.print(a + " ");
                System.out.print(b + " ");
                
            }   
            System.out.println();
            for (int k = 0; k<4;k++ ){
                System.out.print(b + " ");
                System.out.print(a + " ");
            }    
        }
            System.out.println();
            System.out.println();


        int size = 6;
        for (int l = 1; l < size; l++){
            for (int j=0; j < l; j++){
                System.out.print("X" );
            }
            for (int m=1; m < size-l; m++ ){
                System.out.print("-");
            }System.out.println();
        }
}
}
