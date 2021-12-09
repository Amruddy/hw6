package hw6.animals;

public class Animal {
    String name;
    String type;
    int maxRunDist;
    int maxSwimDist;
    private static int count;

    public Animal(String name, String type, int maxRunDist, int maxSwimDist){
        this.name = name;
        this.type = type;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }
    public void run(int dist){
        if (maxRunDist ==0){
            System.out.printf("%s %s не умеет бегать\n", type, name);
            return;
        }
        if (dist < 0){
            System.out.println("Введите положительное число");
            return;
        }
        if (dist >= 0){
            System.out.printf("%s %s пробежал %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d метров\n", type, name, dist);
        }
    }
    public void swim(int dist){
        if (maxRunDist == 0){
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }
        if (dist < 0){
            System.out.println("Введите положительное число");
            return;
        }
        if (dist >= 0){
            System.out.printf("%s %s проплыл %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог проплыть %d метров\n", type, name, dist);
        }
    }
    public static int getCount(){
        return count;
    }
}