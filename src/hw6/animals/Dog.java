package hw6.animals;

public class Dog extends Animal {
    private static int count;
    public Dog(String name, int maxRunDist, int maxSwimDist) {
        super(name, "Собака", maxRunDist, maxSwimDist);
        count++;
    }
    public Dog(String name){
        super(name, "Собака", 500, 10);
        count++;

    }
    public static int getCountCat(){return count;}
}
