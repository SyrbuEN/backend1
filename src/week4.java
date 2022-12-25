import java.util.Date;
public class week4 {

    public static void task1(){

        //упаковка
        byte b = 1;
        Byte boxedB;
        boxedB = new Byte(b);
        boxedB = Byte.valueOf(b);
        boxedB = b;
        //распаковка
        byte unboxedB;
        unboxedB = boxedB.byteValue();
        unboxedB = boxedB;

        //упаковка
        short s = -4;
        Short boxedS;
        boxedS = new Short(s);
        boxedS = Short.valueOf(s);
        boxedS = s;
        //распаковка
        short unboxedS;
        unboxedS = boxedS.shortValue();
        unboxedS = boxedS;

        //упаковка
        int i = 2345;
        Integer boxedI;
        boxedI = new Integer(i);
        boxedI = Integer.valueOf(i);
        boxedI = i;
        //распаковка
        int unboxedI;
        unboxedI = boxedI.intValue();
        unboxedI = boxedI;

        //упаковка
        long l = 123456L;
        Long boxedL;
        boxedL = new Long(l);
        boxedL = Long.valueOf(l);
        boxedL = l;
        //распаковка
        long unboxedL;
        unboxedL = boxedL.longValue();
        unboxedL = boxedL;

        //упаковка
        char c = '$';
        Character boxedC;
        boxedC = new Character(c);
        boxedC = Character.valueOf(c);
        boxedC = c;
        //распаковка
        char unboxedC;
        unboxedC = boxedC.charValue();
        unboxedC = boxedC;

        //упаковка
        float f = -7123.72F;
        Float boxedF;
        boxedF = new Float(f);
        boxedF = Float.valueOf(f);
        boxedF = f;
        //распаковка
        float unboxedF;
        unboxedF = boxedF.floatValue();
        unboxedF = boxedF;

        //упаковка
        double d = 62578.87;
        Double boxedD;
        boxedD = new Double(d);
        boxedD = Double.valueOf(d);
        boxedD = d;
        //распаковка
        double unboxedD;
        unboxedD = boxedD.doubleValue();
        unboxedD = boxedD;

        //упаковка
        boolean bool = false;
        Boolean boxedBool;
        boxedBool = new Boolean(bool);
        boxedBool = Boolean.valueOf(bool);
        boxedBool = bool;
        //распаковка
        boolean unboxedBool;
        unboxedBool = boxedBool.booleanValue();
        unboxedBool = boxedBool;

    }

    public static void task2(){

        int base = 5;
        int side1 = 8;
        double side2 = Math.sqrt(Math.pow(side1, 2) - Math.pow(base, 2));
        double perimeter = base + side1 + side2;
        double area = base * side2 / 2;
        System.out.println(perimeter);
        System.out.println(area);
        System.out.println(perimeter > 15);
        System.out.println(area < 30);

    }

    public static void task3(){

        int b = 50;
        int c = 20;
        ++b;
        --c;
        System.out.println(b >= 51 || c < 22);

    }

    public static void task4(){

        String str = "Training Java";
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        Date currentDate = new Date();
        System.out.println(str + " " + currentDate);

    }

    public static void main(String[] args){

        System.out.println("Задание 1:");
        task1();
        System.out.println("Задание 2:");
        task2();
        System.out.println("Задание 3:");
        task3();
        System.out.println("Задание 4:");
        task4();

    }

}