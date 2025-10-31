package _28_WildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Dog dog = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect(dogBox);
        Unbounded.inspect(catBox);

        Box<Animal> animalBox = new Box<>();
        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());
        UpperBounded.inspect(corgiBox);
        UpperBounded.inspect(dogBox);
//        UpperBounded.inspect(animalBox); 불가능
//        UpperBounded.inspect(catBox); 불가능
        Box<Object> objectBox = new Box<>();
        LowerBounded.inspect(animalBox);
        LowerBounded.inspect(objectBox);
        LowerBounded.inspect(dogBox);
//        LowerBounded.inspect(corgiBox);
//        LowerBounded.inspect(catBox);


    }
}
