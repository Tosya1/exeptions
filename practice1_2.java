import java.util.Arrays;

//2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
//возвращающий новый массив, каждый элемент которого равен разности элементов двух 
//входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
//оповестить пользователя.

public class practice1_2 {
    public static void main(String[] args) {
        int[] a = {8, 3, 10},
        b ={2, 1, 5},
        c = {7, 6};
        System.out.println(Arrays.toString(sub(a, b)));
        System.out.println(Arrays.toString(sub(a, c)));
    }

    public static int[] sub (int[]a, int[]b) {
        int [] c = new int [a.length];
        if (a.length != b.length) {
            throw new RuntimeException("Массивы разной длины! Длина первого массива " + a.length + ", Длина второго массива " + b.length + ".");
        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]-b[i];
        }
        return c;
    }

}
