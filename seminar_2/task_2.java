// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. результат - a4b3cd2

package seminar_2;

public class task_2 {
    public static void main(String[] args) {
        System.out.println(compress("aaaabbbcdd")); // a4b3cd2
    }
    private static String compress(String source) {
        String encode = new String();
        int count = 1;
        for (int i = 0; i < source.length()-1; i++) {
            if(source.charAt(i) == source.charAt(i + 1)) {
                count ++;
            } else {
                encode += source.charAt(i);
                if(count != 1){
                    encode += count;
                }
                count = 1;
            }
        }
        encode += source.charAt(source.length()-1);
        if(count != 1){
            encode += count;
        }
        return encode;
    }
}