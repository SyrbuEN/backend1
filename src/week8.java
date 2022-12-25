import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

public class week8 {

    public static void task1(){

        LinkedList<String> language = new LinkedList<String>();

        language.add("Java");
        language.addFirst("C++");
        language.addLast("Python");

        System.out.println("Изначальный список: " + language.toString());

        System.out.println("Первый элемент: " + language.peekFirst());
        System.out.println("Последний элемент: " + language.peekLast());
        System.out.println("Список после чтения крайних элементов без удаления: " + language.toString());

        System.out.println("Первый элемент: " + language.pollFirst());
        System.out.println("Последний элемент: " + language.pollLast());
        System.out.println("Список после чтения крайних элементов с удалением: " + language.toString());

    }

    public static void task2(){

        HashMap<String, String> programmers = new HashMap<>();

        programmers.put("C++", "Герасимов Дмитрий Олегович");
        programmers.put("Python", "Стариков Дмитрий Андреевич");
        programmers.put("Java", "Зиновьев Станислав Александрович");

        for (Map.Entry<String,String> element : programmers.entrySet()) {
            System.out.println(element);
        }

        Set<String> keys = programmers.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(programmers.values());
        System.out.println("Значения: " + values);

    }

    public static void task3(){

        LinkedList<String> languageList = new LinkedList<String>();

        languageList.add("Java");
        languageList.addFirst("C++");
        languageList.addLast("Python");

        HashMap<Integer, String> languageMap = new HashMap<>();

        for (String element : languageList) {
            int key = languageList.indexOf(element);
            languageMap.put(key, element);
        }
        System.out.println(languageMap);
    }

    public static void main(String[] args){

        System.out.println("Задание 1:");
        task1();
        System.out.println("Задание 2:");
        task2();
        System.out.println("Задание 3:");
        task3();

    }
}
