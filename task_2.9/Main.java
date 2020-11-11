
public class Main {

    public static void main(String[] args) {

    	int chek_num = 5;
    	boolean b_bul = true;

    	int arr[] = {7,4,7,0,2,1,2,88,99,5,3,777,9};

    	for (int i = 0; i < arr.length; i++) {

    		if (chek_num == arr[i]) {

			System.out.println("да");
			b_bul = false;
			
		}
    	}

    	if (b_bul) System.out.println("нет");
    	
    }
}

