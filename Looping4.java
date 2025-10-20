public class Looping4 {
    public static void main(String[] args) {
        System.out.println("Case 1");
        for (int rows = 1; rows <=4; rows++){
            for (int cols = 1; cols <= 8; cols++){
                System.out.print(cols + " ");
            }
            System.out.println("");
            
        }
        System.out.println(""); 
        System.out.println("Case 2");
        for (int rows2 = 1; rows2 <=3; rows2 ++){
            for (int cols2 = rows2; cols2 <= 12+rows2; cols2 +=2){
                System.out.print(cols2 + " ");

            }
            System.out.println("");

             
        }
        System.out.println("");
        System.out.println("Case 3");
        for (int row3 = 1; row3 <= 3; row3++) { 
            for (int col3 = 1; col3 <= 3; col3++) {
                System.out.println(row3 + " x " + col3 + " = " + (row3 * col3));
    }
        
    }
    System.out.println("");
    System.out.println("Case 4");
    for (int row4 = 1; row4 <= 8; row4++) { 
            for (int col4 = row4; col4 <= 8; col4++) { 
                System.out.print(col4 + " "); 
            }
            System.out.println(); 
        }
        System.out.println("");
        System.out.println("Case 5");
        int a = 0;
       int b = 1;
       int i = 0;
       System.out.print (a + " ");
       while(i<9){
        int c = a + b;
        b = a;
        a = c;
        System.out.print(c + " ");
        i++;
       }
       System.out.println("");
       System.out.println("Case 6");
       int d = 0;
       int e = 0;
       int f = 1;
       int o = 0;
       System.out.print(d + " ");
       System.out.print(e + " ");
       while (o<7){
        int g = d + e + f;
        d = e;
        e = f;
        f = g;
        System.out.print(g + " ");
        o++;
       }
    }
}
