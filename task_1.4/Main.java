import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        double tf,tc_d,r,t,y;

        t = 9;
        y = 5;

        r = t / y;

        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        tc_d = tc;

        tf =  r * tc_d + 32;
        System.out.println(tf);
    
    
    
    }
    
}
