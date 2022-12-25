package week11;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        eat();
        System.out.println("Я рыбка и я плаваю");
    }

    private void eat() {
        System.out.println("Я рыбка и для того, чтобы поплыть, мне нужно покушать");
    }
}
