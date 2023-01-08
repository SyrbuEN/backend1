package week12;

public class Beaver extends AbstractAnimal {
    @Override
    void eat() {
        System.out.println("Я бобер и я ем дерево");
    }

    @Override
    void play() {
        System.out.println("Я бобер и у меня нет времени на игры, мне нужно строить плотину");
    }
}
