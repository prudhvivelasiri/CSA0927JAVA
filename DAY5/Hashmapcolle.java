import java.util.HashMap;

public class Hashmapcolle{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("KELLY",39);
        map.put("DIMITRI",45);
        map.put("ARE",12);
        map.put("BESTFRIENDS",34);
        System.out.println("Size of map is:"+ map.size());
        System.out.println(map);
        map.replace("KELLY",07);
        System.out.println(map);
        map.remove("DIMITRI",39);
        System.out.println(map);
    }
}