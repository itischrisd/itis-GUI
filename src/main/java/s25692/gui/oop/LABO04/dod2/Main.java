package s25692.gui.oop.LABO04.dod2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] arr = {
                "office A", "John", "Doe",
                "office B", "John", "Brown",
                "office C", "Mary", "Jones",
                "office B", "Adam", "Rust",
                "office C", "Cindy", "Frost",
                "office A", "Kate", "Coe",
                "office A", "Bill", "Brown"
        };

        Map<String, List<Person>> workers = new HashMap<>();

        for (int i = 0; i < arr.length; i += 3) {
            if (!workers.containsKey(arr[i])) {
                workers.put(arr[i], new ArrayList<>());
                workers.get(arr[i]).add(new Person(arr[i + 1], arr[i + 2]));
            } else
                workers.get(arr[i]).add(new Person(arr[i + 1], arr[i + 2]));
        }

        System.out.println(workers.toString().replaceAll(" o", "\no"));

        String tempOffice = "";
        int tempSize = 0;
        for (Map.Entry<String, List<Person>> entry : workers.entrySet()) {
            if (entry.getValue().size() > tempSize) {
                tempSize = entry.getValue().size();
                tempOffice = entry.getKey();
            }
        }

        System.out.println(tempOffice + ": " + tempSize + " users");
    }
}
