import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к файлу (.../text.txt):");
        String path_file = scan.nextLine();

//работа с файлом ========================================
        FileReader reader = null;
        ArrayList<String> tempArr = new ArrayList<>();
        
        try {
            reader =  new FileReader(path_file);
            
            String from_file = "";
            int a;
            String temp ="";

            while((a = reader.read()) != -1) {

                if(a != 10){
                //from_file = from_file + (char)a;
                temp = temp + (char)a;
                } 
                else {
                tempArr.add(temp);
                temp ="";}
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
   //=====================================================     
        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i = 0; i < tempArr.size(); i++ ){
            arrNum.add(Integer.parseInt(tempArr.get(i)));
        }
        
        Collections.sort(arrNum,Collections.reverseOrder());
        Collections.reverse(arrNum);
        int f = 0;

        for(int j= 0; j < arrNum.size(); j++ ){
            f = arrNum.get(j) % 2;
            
            if(f == 0) System.out.println(arrNum.get(j));

        }
    }
}
