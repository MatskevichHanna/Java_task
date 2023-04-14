// Взять набор строк, например, "Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный Пора красавица проснись"
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. 
// Строки с одинаковой длиной не должны “потеряться”.
// private void sortByLength(String text) {
// // парсим текст на слова
// // печатаем слова в порядке возрастания длины
// }

package seminar_5;

import java.util.Map;
import java.util.TreeMap;

public class task_2 {
    public static void main(String[] args) {
        sortByLenght("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }

    public static void sortByLenght(String text){
        String[] splitText = text.split(" ");
        Map<Integer, String> db = new TreeMap<>();
        for (String string: splitText) {
            int count = 0;
            while(db.containsKey(string.length() * 100 + count)){
                count ++;
            }
            db.putIfAbsent(string.length() * 100 + count, string);
        }
        System.out.println(db);
    }
}
