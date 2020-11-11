import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        int type_sum_cash= scan.nextInt();
        float f_sum_cash = (float)type_sum_cash;

        System.out.println("Введите желаемый процент:");
        int type_procent= scan.nextInt();

        int year = 0;

        for (int i=0; i<5; i++){

            f_sum_cash = (f_sum_cash / 100 *type_procent) + f_sum_cash;
            year++;
            type_sum_cash *= year;
            System.out.println("за "+year+" год/лет: - "+f_sum_cash+" кэцэ");

        }
        
    }
}
