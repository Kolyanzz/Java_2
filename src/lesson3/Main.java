package lesson3;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       punct1();
       punct2();
    }
    private static void punct1(){
        Map<String, Integer> hm = new HashMap<>();
        String[] cities = {
                "Москва", "Калининград", "Мурманск", "Анапа",
                "Находка", "Мурманск", "Москва", "Сочи",
                "Томск", "Благовещенск", "Мурманск", "Анапа",
        };
        for (int i = 0; i < cities.length; i++) {
            if (hm.containsKey(cities[i]))
                hm.put(cities[i], hm.get(cities[i]) + 1);
            else
                hm.put(cities[i], 1);
        }
        System.out.println(hm);
    }
    private static void punct2() {
        Kontacts directory = new Kontacts();

        directory.add("Сергеев", "8923123321");
        directory.add("Моржов", "8913155326");
        directory.add("Бородулин", "89523218891");
        directory.add("Волков", "8913455672");
        directory.add("Сарокин", "89058797944");
        directory.add("Моржов", "89922356791");
        directory.add("Сергеев", "89923231999");
        directory.add("Волков", "8952623113");
        directory.add("Сергеев", "8924325834");

        System.out.println(directory.get("Сергеев"));
        System.out.println(directory.get("Моржов"));
        System.out.println(directory.get("Волков"));
        System.out.println(directory.get("Бородулин"));
    }
}
