import java.util.LinkedList;
import java.util.Queue;
public class Queueque {
    public static void main(String[] args)
    {
        Queue<Integer> B= new LinkedList<Integer>();
        B.add(78);
        B.add(90);
        B.add(23);
        B.add(45);
        B.add(56);
        System.out.println(B);
        B.remove(45);
        System.out.println(B);
        Integer Front= B.remove();
        System.out.println(B);
        boolean Back=B.add(34);
        System.out.println(B);

    }
}