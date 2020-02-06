package lesson3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Iterator;


public class Kontacts {
    private Map<String, List<String>> abonent = new HashMap<>();
    private List<String> number;

    public void add(String name, String phone) {
        if (abonent.containsKey(name)) {
            number = abonent.get(name);
            number.add(phone);
            abonent.put(name, number);
        } else {
            number = new ArrayList<>();
            number.add(phone);
            abonent.put(name, number);
        }
    }

    public List<String> get(String surname) {
        return abonent.get(surname);
    }

}