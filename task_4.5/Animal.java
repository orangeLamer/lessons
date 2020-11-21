public abstract class Animal {
    boolean mu;
    String eat_you;
    int speed;

    Animal(boolean mu,String eat_you, int speed){
        this.mu = mu;
        this.eat_you = eat_you;
        this.speed = speed;
    }
    boolean mu(){return this.mu;}
    String eat_you(){return this.eat_you;}
    int speed(){return this.speed;}


}
