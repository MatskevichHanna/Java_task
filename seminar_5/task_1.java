/**
* (foo, bar) -> false
* (paper, title) -> true
* (add, egg) -> true
* (abcde, bcdef) -> true
* Каждому символу первого слова может соответствовать только 1 символ второго слова
*/

package seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println(isIsomorph("title", "piple"));
        System.out.println(isIsomorph("foo", "bar"));
    }

    public static boolean isIsomorph(String firstStr, String secondStr) {
        if(firstStr.length() == secondStr.length()){
            Map<Character, Character> symbol = new HashMap<>();
            for (int i = 0; i < firstStr.length(); i++) {
                if(!symbol.containsKey(firstStr.charAt(i))){
                    symbol.put(firstStr.charAt(i), secondStr.charAt(i));
                }
                else
                    if(!symbol.get(firstStr.charAt(i)).equals(secondStr.charAt(i))){
                        return false;
                    }
            }
            return true;
        }
        return false;
    }
}
