/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
               float a;

                Scanner scan = new Scanner(System.in);
                int type_user = scan.nextInt();

                float tu_f = type_user;

                a = tu_f / 100 * 15 + tu_f;

                System.out.println(a);
        
        
        
        
    }
}
