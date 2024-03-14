public class Q11c_PassingCurrentObjectAsParameter {
        private int number;
        public Q11c_PassingCurrentObjectAsParameter(int number) {
            this.number = number;
        }
        public void processData(Q11c_PassingCurrentObjectAsParameter anotherObject) {
            int sum = this.number + anotherObject.number;
            System.out.println("Sum: " + sum);
        }
        public static void main(String[] args) {
            Q11c_PassingCurrentObjectAsParameter obj1 = new
                    Q11c_PassingCurrentObjectAsParameter (30);
            Q11c_PassingCurrentObjectAsParameter obj2 = new
                    Q11c_PassingCurrentObjectAsParameter(15);
            obj1.processData(obj2);
        }
    }

