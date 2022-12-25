import java.util.Scanner;

public class week5 {

    public static void task1(){

        System.out.print("Введите температуру целым числом: ");
        Scanner inputInt = new Scanner(System.in);
        int t = inputInt.nextInt();
        if (t < 0) {
            System.out.println("Сейчас очень холодно");
        }
        else if ((t >= 0) && (t <= 16)) {
            System.out.println("Сейчас прохладно");
        }
        else {
            System.out.println("Отличный летний денек!");
        }

    }

    public static void task2(){

        System.out.print("Введите число: ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int tail = n % 2;
        String result = tail == 0 ? "Введенное число четное" : "Введенное число нечетное";
        System.out.println(result);

    }

    public static void task3(){

        enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
        Week i = Week.Wednesday;
        switch (i) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Задан будний день");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Задан выходной день");
                break;
        }

    }

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        task1();
        System.out.println("Задание 2:");
        task2();
        System.out.println("Задание 3:");
        task3();
    }
}
