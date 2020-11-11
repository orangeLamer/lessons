public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b, c, d;
        a = 7;
        b = 3;
        d = a / b;

        c = a % b;
        if (c != 0)
            System.out.println("Делится с остатком, остаток - " + c);
        else
            System.out.println("Делится, результат - "+ d);
        
    }
}
