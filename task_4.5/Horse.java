public class Horse extends Animal {
    String pet_name;
    boolean smoke;
    String color;

    public Horse(boolean mu,String eat_you, int speed, String pet_name,boolean smoke, String color){
        super (mu,eat_you,speed);
        this.pet_name=pet_name;
        this.smoke=smoke;
        this.color=color;
    }


    public void run(){ System.out.println("Игого, я поскакал(а)"); }
}
