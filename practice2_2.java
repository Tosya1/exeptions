// Если необходимо, исправьте данный код 
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
// }

public class practice2_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 8};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
