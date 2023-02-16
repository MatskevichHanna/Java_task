package seminar_1;
import java.util.Arrays;
public class task_2 {
    /**
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
     * конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть
     * отличны от заданного, а остальные - равны ему.
     */
    public static void main(String[] args) {
        int[] array = { 3, 2, 2, 3 };
        swap(array, 3);
        System.out.println(Arrays.toString(array)); // [2, 2, 3, 3]
    }

    private static void swap(int[] array, int val) {

    }
}
