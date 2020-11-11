public class Main {

    public static void main(String[] args) {
	

        int arr[]={1,3,4,5,1,3,5,7,4,44444,2,3,7,7};

        boolean b_B = true;

            for (int i = 0; i < arr.length - 1; i++ ){
                if ( arr[i] == arr[i+1]){

                    System.out.println("да");
                    b_B = false;

                }
            }

            if (b_B) System.out.println("нет"); 

    }
}
