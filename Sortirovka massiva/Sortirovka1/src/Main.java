import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 int[] array = {10, 2, 10, 3, 1, 2, 5};
 System.out.println(Arrays.toString(array));
 boolean needIteration = true;
 while (needIteration) {
     needIteration = false;
     for (int i = 1; i < array.length; i++){
         if (array[i] < array[i - 1]){
             swap(array, i, i-1);
             needIteration = true;
         }
     }
 }
 System.out.println(Arrays.toString(array));
    }
}