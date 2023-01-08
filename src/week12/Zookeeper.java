package week12;

public class Zookeeper {
    void makeFeed(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными в зоопарке и сейчас я накормлю животное");
        abstractAnimal.eat();
    }

    void makePlay(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными и сейчас я попробую поиграть с животным");
        abstractAnimal.play();
    }
}
