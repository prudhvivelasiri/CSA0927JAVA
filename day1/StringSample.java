public class StringSample {
    public static void main(String[] args){
        String s="my name is prudhvi";
        String c=s.toUpperCase();
        System.out.println(c);
        String b=s.replace('d','k');
        System.out.println("NEW STRING:" +b);
        String g=s.substring(11,18);
        System.out.println("SUBSTRINGS: " +g);
        char e=s.charAt(11);
        System.out.println("CHAR AT: " +e);
        String f=s.concat("@");
        System.out.println("CONCACT: " +f);
        boolean k=s.startsWith("m");
        System.out.println(k);


    }
}
