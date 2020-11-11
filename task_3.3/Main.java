import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //напишите тут ваш код

        bingo();
    
    }

    static void bingo (){
        Scanner scan = new Scanner(System.in);
        System.out.println("type one number:");
        int typ1 = scan.nextInt();
        System.out.println("type second number:");
        int typ2 = scan.nextInt();

        System.out.println(equally(typ1,typ2));
    }

    static boolean equally(int num1, int num2){
        
        if (num1 == num2)
        return true;
        else
        return false;
    }
}
