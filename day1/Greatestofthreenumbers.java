public class Greatestofthreenumbers{
    public static void main(String[] args){
        int a= 10;
        int b=5;
        int c=7;
        if(a>b && a>c){
            System.out.println(a+ " is greater number");
        } else if (b>a && b>c){
            System.out.println(b+ " is greater number");
        }else {
            System.out.println(c+ " is greater number");
        }
    }
}
