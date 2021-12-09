package hw6;

import hw6.animals.Animal;
import hw6.animals.Cat;
import hw6.animals.Dog;

public class Main {
    public static void main(String[] args) {
       Animal[] animals = {
               new Cat("Tom"),
               new Dog("Muhtar")


        };
        animals[0].run(50);
        animals[0].swim(0);

        animals[1].run(50);
        animals[1].swim(5);

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }

    
    

}



