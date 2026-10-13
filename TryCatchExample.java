public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Ye error dega (Divide by Zero)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Zero se divide nahi kar sakte!");
        }
        
        System.out.println("Program aage sahi se chal raha hai.");
    }
}
