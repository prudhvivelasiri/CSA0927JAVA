public class Q11a_reference_instane {
        private int number;
        public void setNumber(int number) {
            // Use 'this' to refer to the instance variable
            this.number = number;
        }
        public int getNumber() {
            return this.number;
        }
        public static void main(String[] args) {
            Q11a_reference_instane obj = new Q11a_reference_instane();
            obj.setNumber(42);
            System.out.println("Number: " + obj.getNumber());

        }
}