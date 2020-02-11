import java.util.*;
public class Hash {
 public static void main(String[] args) {
    HashMap<String,Integer> people = new HashMap<String,Integer>();
    people.put("ram",20);
    people.put("rahul",30);
    people.put("Anil",25);

    for (String i : people.keySet()) {
      System.out.println("key " + i + " value: " + people.get(i));
    }
    java.util.Collection<Integer> v=people.values();
    Set<Map.Entry<String,Integer>> s=people.entrySet();
    System.out.println(s);
}
}