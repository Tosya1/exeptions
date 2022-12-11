public class practice2_3 {
    public static void main(String[] args) {
        // try {
        //     int a = 90;
        //     int b = 3;
        //     System.out.println(a / b);
        //     printSum(23, 234);
        //     int[] abc = { 1, 2 };
        //     abc[3] = 9;
        // } catch (Throwable ex) {
        //     System.out.println("Что-то пошло не так...");
        // } catch (NullPointerException ex) {
        //     System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        //     System.out.println("Массив выходит за пределы своего размера!");
        // }
        int a = 90;
        int b = 3;
        printDiv(a, b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        addElbyIdx(abc, 3, 9);
    }
    public static void printSum(Integer a, Integer b) {
        try {
            System.out.println(a + b);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static void printDiv(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void addElbyIdx (int[]arr, int idx, int num) {
        try {
            arr[idx] = num;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
