package interfaces;

import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {

        AnimalTransport myTransport = new AnimalTransport();
        ArrayList<Animal> myList = new ArrayList<Animal>();
        myList.add(new Cat());
        myList.add(new Dog());

        for(Animal animal : myList){
            animal.eat();
            myTransport.transport(animal);
        }

       /* Cat cat = new Cat();
        Dog dog = new Dog();*/
    }
}
