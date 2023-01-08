package week12;

public class Leopard extends AbstractAnimal {
    @Override
    void eat() {
        System.out.println("Я леопард и я ем мясо");
    }

    @Override
    void play() {
        super.play();
        System.out.println("Я леопард и со мной играть опасно");
    }
}
