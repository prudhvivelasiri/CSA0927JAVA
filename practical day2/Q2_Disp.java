
    class Parent {
        int a, b;

        Parent() {
            this.a = 10;
            this.b = 15;
        }

        Parent(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void disp() {
            System.out.println("a = " + a + ", b = " + b);
        }
    }

    class Chil extends Parent {
        Chil() {
            super();
        }

        Chil(int a, int b) {
            super(a, b);
        }

        void disp() {
            super.disp();
        }
    }

    public class Q2_Disp {
        public static void main(String[] args) {
            Chil child1 = new Chil();
            System.out.println("Values initialized by default constructor:");
            child1.disp();

            Chil child2 = new Chil(20, 25);
            System.out.println("\nValues initialized by parameterized constructor:");
            child2.disp();
        }
    }


