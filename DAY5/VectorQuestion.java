import java.util.Vector;

    public class VectorQuestion {

        public static void main(String[] args) {
            Vector<String> G = new Vector<>();
            G.add("K");
            G.add("E");
            G.add("M");
            //G.add(9,"We");
            System.out.println(G);
            G.remove("M");
            System.out.println(G);
        }
    }