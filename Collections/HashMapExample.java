package Day9;

import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Hashtable<String,Integer> hashtable = new Hashtable();

        hashtable.put("Raj Kaste",64);
        hashtable.put("Ankit Sharma",77);
        hashtable.put("Omkar Mane",52);

        System.out.println(hashtable);
        System.out.println(hashtable.get("Raj Kaste"));

        System.out.println("removing Omkar Mane...");
        hashtable.remove("Omkar Mane");

        System.out.println("---using entryset()---");
        for(Map.Entry en: hashtable.entrySet()){
            System.out.println(en.getKey()+" -> "+en.getValue());
        }

    }
}
