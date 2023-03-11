// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
// а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
// foo
// bar
// buzz
// print -> [buzz, bar, foo]
// revert
// print -> [bar, foo]

package seminar_4;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<String>();

        boolean run = true;

        while(run)
        {
            String word = in.nextLine();
            if (word.toLowerCase().equals("print")) {
                System.out.println(queue.toString());
            } else if (word.toLowerCase().equals("revert")) {
                queue.removeFirst();
            } else if (word.toLowerCase().equals("exit")) {
                run = false;
            } else {
                queue.addFirst(word);
            }
        }in.close();
    }
}