package Day9;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();

        names.add("Raj Kaste");
        names.add("Ankit Sharma");
        names.add("Akash Lohar");
        names.add("Omkar Mane");
        names.add(2,"Shrirang Diwakar");
        System.out.println(names);
        System.out.println("Akash Lohar updated to-> Sky Patil");
        names.set(3,"Sky Patil");

//        System.out.println(names.get(1));
        System.out.println(names);
//        System.out.println(names.size());
        names.remove(3);

        System.out.println("Sky Patil removed...");

        System.out.println("------using enhanced for loop-------");

        for (String n:names) {
            System.out.println(n);
        }
        System.out.println("Is Sky Patil present: "+names.contains("Sky Patil"));

        System.out.println("------using iterator-------");

        Iterator it = names.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }

        System.out.println("All items cleared...");
        names.clear();
        System.out.println(names);

    }
}
