
package homerwork_1;
import java.util.Arrays;
public class task_5 {
    
    static double max = 0;
    private static double array[] = { -2, 7.1, -5, 0.3, 9, 11 };

    public static void main(String[] args) {
        findMax(array);
        findMin(array);
    }

    public static void findMax(double[] array) {
        Arrays.sort(array);
        max = array[array.length - 1];
        System.out.println(max);
    }

    public static void findMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void findIndexOfMax() {
    }
}

