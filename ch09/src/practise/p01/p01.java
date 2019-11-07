package practise.p01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p01 {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap();
        Set<String> set = map.keySet();
        for (String string : arr) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string)+1);
            } else {
                map.put(string, 1);
            }
        }
        for (String string : set) {
            System.out.println(string + "=" + map.get(string));
        }
    }
}
