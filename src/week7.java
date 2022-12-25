import java.util.ArrayList;

public class week7 {

    public static void task1(){

        int[] intArray   = new int[] {5, 8, 19, 4, 1};
        float sum = 0;
        System.out.println("Элементы массива: ");
        for (int i = 0; i < intArray .length; i++) {
            System.out.println(intArray[i]);
            sum = sum + intArray [i];
        }
        System.out.println("Среднее арифметическое = " + sum / intArray.length);

    }

    public static void task2(){

        int[] intArray   = new int[] {5, 8, 19, 4, 1};
        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println("Элементы массива: ");
        for (int i = 0; i < intArray .length; i++) {
            if (intArray[i] % 2 == 1){
                intList.add(intArray[i]);
                intArray[i] = 0;
            }
            System.out.println(intArray[i]);
        }

        System.out.println("Элементы списка: ");
        for (Integer element : intList) {
            System.out.println(element);
        }

    }

    public static void task3(){

        ArrayList<String> StringList = new ArrayList<String>();

        StringList.add("Понедельник");
        StringList.add("Вторник");
        StringList.add("Среда");
        StringList.add("Четверг");
        StringList.add("Пятница");
        StringList.add("Суббота");
        StringList.add("Воскресенье");

        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println("Элементы строкового списка: ");
        for (String element : StringList) {
            System.out.println(element);
            intList.add(element.length());
        }

        System.out.println("Элементы целочисленного списка: ");
        for (Integer element : intList) {
            System.out.println(element);
        }

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
