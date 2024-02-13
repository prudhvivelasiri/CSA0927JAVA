import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetcollec {
    public static void main(String[] args){
        SortedSet<String> L=new TreeSet<String>();
        L.add("prudhvi");
        L.add("loves");
        L.add("kabbadi");
        L.add("and cricket");
        System.out.println(L);
        L.remove("and cricket");
        System.out.println(L);
    }
}