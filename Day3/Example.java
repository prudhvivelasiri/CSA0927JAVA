public class Example extends Constructors{
    //INTERCHANGING PARAMETERS
   // void add(String a,int b){
     //  String c=a+b;
       // System.out.println(c);
    //}
    //INC OR DEC NO OF PARAMETERS
    void add(int a,int b,int c){
       int d=a+b+c;
        System.out.println(d);
    }
    // void add(int a,double b){
     //   double c=a+b;
       // System.out.println(c);
    //}
    public static void main (String[] args){
        Example c=new Example();
        c.add(3,2, 5);
    }

}
