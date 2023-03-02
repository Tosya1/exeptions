public class View {
    public static void print(String str) {
        System.out.println(str);
    }

    public static String getInfo() {
        return System.console().readLine();
    }
}

