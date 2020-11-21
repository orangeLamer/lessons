public class Pegasus extends Horse {

    public static void main(String[] args) {
        Horse batuy = new Horse(false,"нууу?!", 45,"Конь",true,"черная смоль");
        Pegasus kesha = new Pegasus(false,"ну-Нееет", 93,"Инакентий",true,"фиолетовый");

        kesha.fly();
        batuy.run();
    }

    Pegasus(boolean mu,String eat_you, int speed, String pet_name,boolean smoke, String color){
        super(mu,eat_you,speed,pet_name,smoke,color);

    }
    void fly(){ System.out.println("Игого, я полетел(а)");}

    @Override
    public void run(){ System.out.println("Игого, я поскакал(а)");}


}
