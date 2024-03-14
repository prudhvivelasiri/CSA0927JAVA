public class Q4_overload_method {

    // Method overloading by increasing and decreasing the number of parameters
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading by changing the data types of parameters
    double sum(double a, double b) {
        return a + b;
    }

    // Method overloading by interchanging the parameters
    int sum(int b, double a) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        Q4_overload_method demo =   new   Q4_overload_method ();

        // Testing method overloading by increasing and decreasing the number of parameters
        System.out.println("Sum of 2 and 3: " + demo.sum(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + demo.sum(2, 3, 4));

        // Testing method overloading by changing the data types of parameters
        System.out.println("Sum of 2.5 and 3.7: " + demo.sum(2.5, 3.7));

        // Testing method overloading by interchanging the parameters
        System.out.println("Sum of 2 and 3.5: " + demo.sum(2, 3.5));
    }
}
