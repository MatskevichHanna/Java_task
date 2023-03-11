// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package homerwork_4;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> resulList = new ArrayList<>();
        int arrSize = 100;
        
        for (int i = 0; i < arrSize; i++) {
            resulList.add(" ");    
        }
      
        Boolean run = true;

        while (run) {

            String text = sc.nextLine();
        
            if (text.toLowerCase().equals("stop")) {
                run = false;
            } 
            
            else if (text.toLowerCase().equals("toscreen")) {
                System.out.println(resulList.toString());     
            }
            else if (text.toLowerCase().contains("print")){
                String[] split = text.split("~");
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                System.out.println(resulList.get(indexNumber));
            }

            else {
                String[] split = text.split("~");
                String word = split[0];
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                resulList.add(indexNumber, word); 
            }

        }

        sc.close();

    }
}
