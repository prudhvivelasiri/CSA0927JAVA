public class Classnotfound
{
        public static void main(String[] args) {
            try {
                Class.forName("PRUDHVI");
            } catch (ClassNotFoundException e) {
                System.out.println("there is an exception"+e);
            }
        }
    }

