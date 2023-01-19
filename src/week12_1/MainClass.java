package week12_1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 10));
        animals.add(new Animal("dog", 9));
        animals.add(new Animal("horse", 8));
        animals.add(new Animal("pig", 7));
        animals.add(new Animal("cow", 6));
        animals.add(new Animal("mouse", 5));
        animals.add(new Animal("lion", 4));
        animals.add(new Animal("elephant", 3));
        animals.add(new Animal("duck", 2));
        animals.add(new Animal("chicken", 1));


//        Optional<Animal> filterAnimal = animals.stream()
//                .filter(animal -> animal.getName().equals(name))
//                .findAny();
//        if (filterAnimal.isPresent()){
//            System.out.println(filterAnimal.get());
//        }
//        else {
//            new IllegalArgumentException("В коллекции не найден: " + name);
//        }

        //1
        String name = "lion";
        animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .peek(System.out::println)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("В коллекции не найден: " + name));

        //2
        List<Animal> sortedAnimals = animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .collect(Collectors.toList());
        System.out.println("Все животные, в порядке возрастания возраста: " + sortedAnimals);

        //3
        Stream<Animal> filterAnimalsAge = animals.stream()
                .filter(animal -> animal.getAge() > 4);
        long count = filterAnimalsAge.count();
        System.out.println("Животных старше 4 лет: " + count);

        //4
        HashMap<String, Integer> mapAnimals = new HashMap<>();
        animals.stream()
                .forEach(animal -> mapAnimals.put(animal.getName(), animal.getAge()));
        System.out.println(mapAnimals);

        //5
        String namesInString = animals.stream()
                .map(Animal::getName)
                .reduce("", (prev,next) -> prev + " "+ next);
        System.out.println("Все имена животных в одну строку: " + namesInString);
    }
}


