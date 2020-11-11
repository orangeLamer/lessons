
public class Main {

    public static void main(String[] args) {
	

        int[] arr = {2, 3, 4, 5};
        int resultt = arr[0];



        for (int i = 1; i < arr.length; i++){

            resultt *= arr[i];  

            
        }

        System.out.println(resultt);
    }

}
