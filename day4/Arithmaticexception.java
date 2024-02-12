import java.util.Scanner;
public class Arithmaticexception {
    public static void main(String[] arr){
        try{
            int a=10;
            int b=0;
          int  c=a/b;
            System.out.println(c);

        }
        catch(Exception e){
            System.out.println("there is an exception" +e);
        }
    }
}
