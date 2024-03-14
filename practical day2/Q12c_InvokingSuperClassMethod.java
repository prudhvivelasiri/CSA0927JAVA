
    class Animal3 {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Dogs extends Animal3 {
        void eat() {
            super.eat();
            System.out.println("Dog is eating");
        }
    }
    public class  Q12c_InvokingSuperClassMethod {
        public static void main(String[] args) {
            Dogs myDog = new Dogs();
            myDog.eat();
        }
    }


