public class Main {

    public static int min (int a, int b, int c, int d) {

        //напишите тут ваш код

        int result = min( min( a,b ), min( c,d ));
        return result;



    }




    static int min (int a, int b) {

        //напишите тут ваш код

        int resultttt = b;
        if (a < b)  resultttt = a;
        return  resultttt;

    }




    public static void main(String[] args) throws Exception {

        System.out.println(min(-20, -10));

        System.out.println(min(-40, -10, -30, 40));

        System.out.println(min(-20, -40, -30, 40));

        System.out.println(min(-20, -10, -40, 40));

        System.out.println(min(-20, -10, -30, -40));

    }
}
