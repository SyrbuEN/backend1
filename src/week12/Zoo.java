package week12;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Horse horse = new Horse();
        Leopard leopard = new Leopard();
        Beaver beaver = new Beaver();


        System.out.println("Сейчас смотритель за животными накормит всех животных");
        System.out.println("----------------------------");
        zookeeper.makeFeed(horse);
        System.out.println("----------------------------");
        zookeeper.makeFeed(leopard);
        System.out.println("----------------------------");
        zookeeper.makeFeed(beaver);
        System.out.println("----------------------------");

        System.out.println("Сейчас смотритель за животными поиграет с животными");
        System.out.println("----------------------------");
        zookeeper.makePlay(horse);
        System.out.println("----------------------------");
        zookeeper.makePlay(leopard);
        System.out.println("----------------------------");
        zookeeper.makePlay(beaver);
        System.out.println("----------------------------");
    }
}
