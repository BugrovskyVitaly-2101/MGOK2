import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int [] array = {10, 2, 10, 3, 1, 2, 5};
System.out.println(Arrays.toString(array));
for (int i = 1; i < array.length; i++) {
    if (array[i] < array[i - 1]) {
        swap(array, i, i -1);
        for (int z = i -1; (z - 1) >= 0; z--) {
            if (array[z] < array[z - 1]) {
                swap(array, z, z - 1);
            } else {
                break;
            }
        }
    }
}
System.out.println(Arrays.toString(array));
    }
}