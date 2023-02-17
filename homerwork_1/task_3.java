// Напечатать строку source repeat раз

package homerwork_1;

public class task_3 {
    public static void main(String[] args) {
        printString("abcd", 5); // abcdabcdabcdabcdabcd
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(source); 
        }     
    }
}

