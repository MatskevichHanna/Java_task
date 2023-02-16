// Проверить, что х положительное

package homerwork_1;

public class task_2 {
    public static void main(String[] args) {
        System.out.println(isPositive(5));
    }

    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
