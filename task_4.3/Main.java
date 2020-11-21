public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 2;
        cat2.age = 3;

        cat1.strength = 7;
        cat2.strength = 10;

        cat1.weight = 6;
        cat2.weight = 7;



        if(cat1.fight(cat2)) System.out.println("won!");
        else System.out.println("next time :(");

        if(cat2.fight(cat1)) System.out.println("won!");
        else System.out.println("next time :(");

        /// возможно, не так!? :/
    }
}


class Cat {

    public int age;
    public int weight;
    public int strength;
    public Cat() {

    }




    public boolean fight(Cat anotherCat) {

       int won = 0;
       if(this.age < anotherCat.age) won+=0;
       else if (this.age > anotherCat.age) won+=2;
       else won +=1;

       if(this.weight < anotherCat.weight) won +=0;
       else if(this.weight > anotherCat.weight) won +=2;
       else won += 1;

       if(this.strength < anotherCat.strength) won += 0;
       else if(this.strength > anotherCat.strength) won += 2;
       else won += 1;

       if(won <= 6 && won >= 4) return true;
       else return false;

    }
}

