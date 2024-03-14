public class Q10_lastkeyword {

        // Final variable
        final int finalVariable = 10;

        // Final method
        final void finalMethod() {
            System.out.println("This is a final method.");
        }

        // Final class
        final class FinalClass {
            void display() {
                System.out.println("This is a final class.");
            }
        }

        public static void main(String[] args) {
            Q10_lastkeyword demo = new Q10_lastkeyword();
            System.out.println("Final variable value: " + demo.finalVariable);
            demo.finalMethod();

            FinalClass finalObj = demo.new FinalClass();
            finalObj.display();
        }
    }


