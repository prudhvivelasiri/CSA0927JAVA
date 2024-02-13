
    import java.util.Set;
import java.util.TreeSet;
    public class Treesetcollec {
        public static void main(String[] args)
        {
            Set<String> L=new TreeSet<String>();
            L.add("prudhvi");
            L.add("reg");
            L.add("192210345");
            System.out.println(L);
            L.remove("reg");
            System.out.println(L);
        }
    }

