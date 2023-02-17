// Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

package homerwork_1;

public class task_6 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arr = array.length;
        for (int i = 0; i < arr; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        for (int i = 0; i < arr; i++) {
            System.out.println(array[i]);
        }
    }
}
