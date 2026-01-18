public class Exercise3 {
    public static void main(String[] args) {
        String name = "Uhail";
        int length = name.length();


        for (int i=0; i<length;i++){
            
                String partname = name.substring(0, i +1);
                System.out.println(partname);
            
        }
    }
}
