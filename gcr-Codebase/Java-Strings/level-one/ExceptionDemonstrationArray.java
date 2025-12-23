public class ExceptionDemonstrationArray {

    public static void main(String[] args) {

        ExceptionHandled();   // handled safely
        generateException(); // handled safely
    }

    // Method to generate the exception
    public static void generateException() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("ArrayIndexOutOfBoundsException handled in generateException");
        }
    }

    // Method to handle the exception
    public static void ExceptionHandled() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException error) {
            System.out.println("RuntimeException handled");
        }
    }
}
