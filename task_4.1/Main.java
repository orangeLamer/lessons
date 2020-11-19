public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}

class Cat {
    String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name= name;

        //// что за бред? setName самодосточна >:-(

    }
}
