import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[];

        arr = new int[10];
        int num,count_repit, max_repit, max_repit_num;


        count_repit = 0;
        max_repit = 1;

        //==================================================

        for (int i = 0; i < arr.length; i++){

            System.out.println(i+1 +". Введите число:");
            arr[i] = scan.nextInt();
        }

        //=================================================

        num = arr[0];
        max_repit_num = num;

        for (int j = 0; j < arr.length; j++){


            if ( num == arr[j]){

                count_repit++;

            } else {

                count_repit = 1;
                num = arr[j];

            }

            if (count_repit > max_repit){
                max_repit = count_repit;
                max_repit_num = num;
            }
        }

        //=============================
        for (int i = 0; i < max_repit; i++) {
            System.out.print(max_repit_num+" - ");
        }
    }
}
