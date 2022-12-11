import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит 
// пустую строку. Пользователю должно показаться сообщение, что пустые строки 
// вводить нельзя.

public class practice2_4 {
    public static void main(String[] args) {
        printMsg();
    }

    public static void printMsg() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите сообщение");
        String msg = sc.nextLine();
        if (msg == "") {
            System.out.println("Пустые строки вводить нельзя.");
        } else {
            System.out.println(msg);
        } 
        sc.close();
    }
}
