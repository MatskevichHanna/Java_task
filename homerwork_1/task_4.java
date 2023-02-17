// Проверить, является ли год високосным. если да - return true

package homerwork_1;

public class task_4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(366)); // true
        System.out.println(isLeapYear(365)); // false
    }

    private static boolean isLeapYear(int year) {
        if (year == 366) {
            return true;
        } else {
            return false;
        }
    }
}
