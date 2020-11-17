import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        
        ArrayList<String> names2 = new ArrayList();

        for (int i=0; i< names.size();i++){

            if (!names2.contains(names.get(i))){
                names2.add(names.get(i));
            }
        }

        System.out.println(names);
        System.out.println(names2);
        
        
    }
}
