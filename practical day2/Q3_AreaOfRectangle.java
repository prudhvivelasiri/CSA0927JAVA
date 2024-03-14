
    class Base {
        void area(int a, int b) {
            int squareArea = a * a;
            System.out.println("Area of the square: " + squareArea);
        }
    }

    class Derived extends Base {
        @Override
        void area(int a, int b) {
            int rectangleArea = a * b;
            System.out.println("Area of the rectangle: " + rectangleArea);
        }
    }

    public class  Q3_AreaOfRectangle{
        public static void main(String[] args) {
            Base baseObj = new Base();
            System.out.println("Calculating area of square:");
            baseObj.area(5, 5); // This will print area of square

            Derived derivedObj = new Derived();
            System.out.println("\nCalculating area of rectangle:");
            derivedObj.area(4, 6); // This will print area of rectangle
        }
    }


