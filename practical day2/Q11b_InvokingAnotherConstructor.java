public class Q11b_InvokingAnotherConstructor{
private int number;
private String text;
// Constructor with two parameters
public Q11b_InvokingAnotherConstructor(int number, String text) {
    this.number = number;
    this.text = text;
}
// Constructor with one parameter, invoking the two-parameter constructor using'this'
public Q11b_InvokingAnotherConstructor(int number) {
    this(number, "Default Text");
}
public void displayValues() {
    System.out.println("Number: " + number);
    System.out.println("Text: " + text);
}
public static void main(String[] args) {
    Q11b_InvokingAnotherConstructor obj1 = new Q11b_InvokingAnotherConstructor(42, "Hello, World!");
    obj1.displayValues();
    Q11b_InvokingAnotherConstructor obj2 = new Q11b_InvokingAnotherConstructor(17);
    obj2.displayValues();
}
}
