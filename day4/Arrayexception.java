public class Arrayexception {
    public static void main(String[] arr){
        try{
           int c[]={2,3,4,5,6};
           for(int i=0;i<=5;i++) {
               System.out.println(c[i]);
           }
        }
        catch(Exception e){
            System.out.println("there is an exception" +e);
        }

}

}
