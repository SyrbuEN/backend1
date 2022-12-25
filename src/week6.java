import java.util.Scanner;

public class week6 {

    public static void task1(){

        System.out.println("цикл while");
        int number = 1;
        int i = 0;
        while (i < 10) {
            System.out.println(number);
            number *= 2;
            i++;
        }

        System.out.println("цикл do..while");
        int number2 = 1;
        int j = 0;
        do {
            System.out.println(number2);
            number2 *= 2;
            j++;
        } while (j < 10);

    }

    public static void task2(){

        int i = 0;
        while (i<50){
            i++;
            if (i==5||i==25){
                continue;
            }
            else if (i==49){
                break;
            }
            System.out.println(i);
        }

    }

    public static void task3(){

        System.out.print("Введите число: ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        long fact = 1L;
        for (int i=0; i<n; ){
            i++;
            fact = fact*i;
        }
        System.out.println(fact);

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
