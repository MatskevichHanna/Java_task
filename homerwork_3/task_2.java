// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

package homerwork_3;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(10);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int max = list1.get(0);
        int min = list1.get(0);
        int sum = 0;
        for (int item : list1) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min= item;
            }
            sum += item;
        }
        float average = (float)sum/list1.size();
        System.out.printf("Максимальный элемент %s\n", max);
        System.out.printf("Минимальный элемент %s\n", min);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
