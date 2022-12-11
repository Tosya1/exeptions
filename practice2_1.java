import java.util.InputMismatchException;
import java.util.Scanner;

// реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. Ввод текста вместо числа не 
// должно приводить к падению приложения, вместо этого, необходимо повторно 
// запросить у пользователя ввод данных.

public class practice2_1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число типа float, например '1,1'");
            System.out.println(sc.nextFloat());
        } catch (InputMismatchException e) {
            System.out.println("Введенное значение не соответствует формату. Попробуйте еще раз.");
            task1();
        } finally {
            sc.close();
        }
    }
}
