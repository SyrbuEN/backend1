public class week3 {

    String color;
    String brand;
    static int count = 0;

    //Задание 2
    public String go(){
        return "едет";
    }

    public String brake(){
        return "тормозит";
    }

    //Задание 3
    public week3(){

    }

    public week3(String color, String brand){
        this.color = color;
        this.brand = brand;
    }

    public static void main(String[] args){

        week3 car1 = new week3();
        car1.color = "red";
        car1.brand = "Reno";
        count++;

//        week3 car2 = new week3();
//        car2.color = "green";
//        car2.brand = "Kia";

        //Задание 3
        week3 car2 = new week3("green", "Kia");
        count++;

        week3 car3 = new week3();
        car3.color = "blue";
        car3.brand = "Toyota";
        count++;

        System.out.println("Количество машин в автопарке: " + count);

//        System.out.println("1: цвет - " + car1.color + ", модель - " + car1.brand);
//        System.out.println("2: цвет - " + car2.color + ", модель - " + car2.brand);
//        System.out.println("3: цвет - " + car3.color + ", модель - " + car3.brand);

        //Задание 2
        System.out.println("1: цвет - " + car1.color + ", модель - " + car1.brand + ". Сейчас она " + car1.go());
        System.out.println("2: цвет - " + car2.color + ", модель - " + car2.brand + ". Сейчас она " + car2.go());
        System.out.println("3: цвет - " + car3.color + ", модель - " + car3.brand + ". Сейчас она " + car2.brake());

    }

}