public class Main {

    public static void main(String[] args) {
	

        int arr[]= {2,1,2,1,2,0,2,6};
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++ ){
            if (a < 10){
                a += arr[i];
                b++;
            }
        }

        System.out.println(b+ " - цифр/ы из массива");
    }
}
