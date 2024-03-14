public class Q11d_ReturningCurrentObject {
        private int number;
        public Q11d_ReturningCurrentObject setNumberAndReturn(int number) {
            this.number = number;
            return this;
        }
        public void displayValue() {
            System.out.println("Number: " + number);
        }
        public static void main(String[] args) {
            Q11d_ReturningCurrentObject obj = new Q11d_ReturningCurrentObject();
            obj.setNumberAndReturn(10).displayValue();
        }
    }

