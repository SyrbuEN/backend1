package week11;

public class week11 {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        SwimExecutor swimExecutor = new SwimExecutor();

        swimExecutor.makeSwim(fish);
        swimExecutor.makeSwim(ship);
    }
}
