// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.

package homerwork_1;

public class task_1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    }

    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b) <= 20 && (a + b) >= 10) {
            return true;
        } else {
            return false;
        }
    }
}