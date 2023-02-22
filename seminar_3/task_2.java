// Заполнить список любыми строкам в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>(List.of(
            "Земля",
            "Венера",
            "Плутон",
            "Венера",
            "Венера",
            "Плутон"));

        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if(!name.contains(data.get(i))){
            name.add(data.get(i));
            count.add(1);
            } else {
            int index = name.indexOf(data.get(i));
            count.set(index, count.get(index)+1);
            }
        }
        System.out.println("Исходный список: " + data.toString());

        for (int i = 0; i < name.size(); i++) {
        System.out.print("Имя " + name.get(i) + " встречается " + count.get(i) + "раз(а)" + "\n");
        }
    }
}