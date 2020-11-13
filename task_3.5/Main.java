public class Main {

    public static void main(String[] args) {

        int num[] = {4,2,6,2,65};
        

        print_my_arr (num.length, num);
    }

    static void print_my_arr(int a,int[] my_arr){
        if (a == 0) return;
            int b = (my_arr.length) - a;
            System.out.print(my_arr[b] + " | " );
      
            print_my_arr(a - 1, my_arr); 
        
        // :-)

    }

}
