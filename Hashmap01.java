import java.util.HashMap;

public class Hashmap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("Indonesia",500);
        System.out.println(hm);
        System.out.println(hm.get("India"));
    }
}