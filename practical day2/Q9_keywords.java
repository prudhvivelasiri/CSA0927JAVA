public class Q9_keywords {

        // Static variable
        static int staticVariable = 10;

        // Static method
        static void staticMethod() {
            System.out.println("This is a static method.");
        }

        // Static block
        static {
            System.out.println("This is a static block.");
        }

        // Static nested class
        static class StaticNestedClass {
            void display() {
                System.out.println("This is a static nested class.");
            }
        }

        public static void main(String[] args) {
            System.out.println("Static variable value: " + staticVariable);
            staticMethod();

            // Creating an instance of StaticNestedClass
            StaticNestedClass nestedObject = new StaticNestedClass();
            nestedObject.display();
        }
    }

