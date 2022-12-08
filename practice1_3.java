import java.util.Arrays;

//* 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
//входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
//оповестить пользователя. Важно: При выполнении метода единственное исключение, 
//которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class practice1_3 {
    public static void main(String[] args) {
        int[] a = {8, 3, 10},
        b ={2, 1, 5},
        c = {7, 6};
        System.out.println(Arrays.toString(div(a, b)));
        System.out.println(Arrays.toString(div(a, c)));
        System.out.println(Arrays.toString(div(null, c)));        
    }

    public static int[] div (int[]a, int[]b) {
        if (a == null || b == null) {
            throw new RuntimeException("Один из массивов равен null");
        } else if (a.length != b.length) {
            throw new RuntimeException("Массивы разной длины! Длина первого массива - " + a.length + ", Длина второго массива - " + b.length + ".");
        } int [] c = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0){
                throw new RuntimeException("Деление на 0! Элемент второго массива c индексом " + i + " равен 0.");
            } c[i] = a[i] / b[i];
        }
        return c;
    }
}
