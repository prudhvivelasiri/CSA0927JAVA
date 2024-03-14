
    public class    Q13_Box<T> {
        private T value;
        // Constructor
        public Q13_Box(T value) {
            this.value = value;
        }
        // Getter and Setter
        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        public static void main(String[] args) {
            // Creating a Box of Integer
            Q13_Box<Integer> integerBox = new Q13_Box<>(42);
            // Creating a Box of String
            Q13_Box<String> stringBox = new Q13_Box<>("Hello, Generics!");
            // Getting values
            System.out.println("Integer Box Value: " + integerBox.getValue());
            System.out.println("String Box Value: " + stringBox.getValue());
            // Setting new values
            integerBox.setValue(99);
            stringBox.setValue("Updated Value");
            // Getting updated values
            System.out.println("Updated Integer Box Value: " + integerBox.getValue());
            System.out.println("Updated String Box Value: " + stringBox.getValue());
        }
    }


