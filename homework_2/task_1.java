// Создать метод, который проверяет, является ли строка палиндромом.

package homework_2;

public class task_1 {
    public static void main(String[] args){
        Printpalindrome("шалаш");  //true
        Printpalindrome("палатка");  //false
    }

    public static void Printpalindrome(String str){
        String reverse = "";
        for ( int i = str.length() - 1; i >= 0; i-- ) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse))
        System.out.println("true"); 
        else
            System.out.println("false"); 
    }
}



