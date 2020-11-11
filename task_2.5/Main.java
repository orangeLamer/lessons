import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int a= scan.nextInt();
        if(a == 10) System.out.println("Верно!");
        else System.out.println("Не верно!");

    }
}
