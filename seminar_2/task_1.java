// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package seminar_2;

public class task_1 {

    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b')); // ababab
    }

    public static String buildString(int n, char first, char second) {
        String N = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                N += first;
            } else {
                N += second;
            }
        }
        return null;
    }
}
