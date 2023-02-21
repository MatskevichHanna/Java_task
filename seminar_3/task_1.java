// Создать список рандомных чисел от 0 до 100(20 чисел). 
// Отсортировать этот список. Вывести на экран.

package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            myList.add(rnd.nextInt(10));
        }
        System.out.println("Список");
        System.out.println(myList.toString());
        Collections.sort(myList);
        System.out.println("Отсортированный список");
        System.out.println(myList.toString());
    }
}
