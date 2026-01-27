package JCF.Maps;

import java.util.*;
import java.util.Map.Entry;


public class Test {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // 1) put(K, V)
        map.put(1, "C");
        map.put(2, "C++");
        map.put(3, "GO");
        map.put(4, "Java");
        map.put(5, "JS");

        System.out.println("Initial Map: " + map);

        // 2) get(Object key)
        System.out.println("get(4): " + map.get(4));

        // 3) remove(Object key)
        map.remove(3);
        System.out.println("After remove(3): " + map);

        // 4) containsKey(Object key)
        System.out.println("containsKey(2): " + map.containsKey(2));

        // 5) containsValue(Object value)
        System.out.println("containsValue(\"Java\"): " + map.containsValue("Java"));

        // 6) size()
        System.out.println("size: " + map.size());

        // 7) isEmpty()
        System.out.println("isEmpty: " + map.isEmpty());

        // 8) clear()
        HashMap<Integer, String> temp = new HashMap<>(map);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // 9) keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("keySet: " + keys);

        // 10) values()
        Collection<String> values = map.values();
        System.out.println("values: " + values);

        // 11) entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entrySet:");
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // 12) putAll(Map m)
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(6, "Python");
        map2.put(7, "Rust");

        map.putAll(map2);
        System.out.println("After putAll(): " + map);

        // 13) replace(K key, V value)
        map.replace(2, "C++17");
        System.out.println("After replace(2): " + map);

        // 14) remove(Object key, Object value)
        map.remove(5, "JS");   // removes only if both match
        System.out.println("After remove(5, \"JS\"): " + map);
        
        Iterator<Entry<Integer,String>> itr = map.entrySet().iterator();
        
        while(itr.hasNext()) {
        	Entry<Integer,String>e = itr.next();
        	System.out.println(e.getKey()+ ":"+e.getValue());
        }
    }
}
