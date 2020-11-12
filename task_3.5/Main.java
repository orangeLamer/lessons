public class Main {

    public static void main(String[] args) {

        int num[] = {4,2,6,2,65};

        print_arr(num.length,num);


    }


        static int print_arr(int a, int[] array){
              // int b;
            if (a == 0){
            
            //if (a == (array.length - 1)){
            // насколько часто может понадобиться рекурсия? 
            // может надо еще потренироваться на примерах из реальных задач????? 

                return a = 0;
        } else {
                a-=1;
                // a++; //????????
                int b = array[a];
                System.out.print(" "+ b);
                print_arr(a ,array);
                return a;
            }
    }

}
