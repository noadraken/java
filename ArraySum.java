

public class ArraySum {
    
    static int sum(int[] array, int index){
        
        if (index == array.length-1){
            return array[index];
        }
        return array[index] + sum(array, index+1);

    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int index = 0;
        System.out.print("The sum of the array is " + sum(array, index));
    }
}
