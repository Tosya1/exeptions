import java.util.Scanner;

//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class practice1_1 {
    public static void main(String[] args) {
        greet();
        System.out.println(div(5,1));
        int[] a = {5, 8, 3};
        System.out.println(getElById(a, 1));
        div(5, 0);
        getElById(a, 5);
    }

//1 - обработка исключения (на входе пустая строка)
    public static void greet() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        if (name == "") {
            greet();
        } else { 
            System.out.println("Привет, " + name);
        }
        sc.close();
    }

//2 - исключение - деление на 0
    public static int div (int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Деление на 0!");
        }
        return a / b;
    }

//3 - исключение - выход за пределы массива
    public static int getElById (int[] a, int idx) {
        if (idx > a.length -1) {
            throw new RuntimeException("Указанный индекс выходит за пределы массива!");
        }
        return a[idx];
    }
}
