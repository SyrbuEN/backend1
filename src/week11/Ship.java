package week11;

public class Ship implements Swimmable {
    @Override
    public void swim() {
        fuel();
        System.out.println("Я корабль и я плаваю");
    }

    private void fuel() {
        System.out.println("Я корабль и для того, чтобы поплыть, мне нужно заправиться");
    }
}
