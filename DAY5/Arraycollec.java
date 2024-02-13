import java.util.ArrayList;
import java.util.List;

public class Arraycollec {
    public static void main(String[] args){
        List<Integer> L=new ArrayList<Integer>();
        L.add(23);
        L.add(50);
        L.add(20);
        L.add(22);
        System.out.println(L);
        L.remove(1);
        System.out.println(L);
    }

}
