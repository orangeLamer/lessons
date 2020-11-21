public class Main {

    public static void main(String[] args) {
        //напишите тут ваш код

        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse uncleMexico = new Mouse("uncle",11,7);
        Dog bulDog = new Dog("Dogi", 40, "meat");
        Cat tomCat = new Cat("Tom",25,"water");
    }

}

class Mouse {

    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {

        this.name = name;
        this.height = height;
        this.tail = tail;

    }
}
class Cat {

    String name;
    int height;
    String drink;

    public Cat (String name, int height, String drink) {

        this.name = name;
        this.height = height;
        this.drink = drink;

    }
}
class Dog {

    String name;
    int height;
    String eat;

    public Dog(String name, int height, String eat) {

        this.name = name;
        this.height = height;
        this.eat = eat;

    }
}

