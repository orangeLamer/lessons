public class Main {

    public static void main(String[] args) {


    	String arr[]= {"Мама", "Мыла", "Раму"};
    	
      int c = 0;
    	String  temp1_word = "";
		  String  temp2_word = "";
    	String  print_word = "";


    	for (int i = 0; i < arr.length; i++){

    		temp1_word = arr[i];

    		for (int j = 0; j < arr.length; j++) {

				  temp2_word = arr[j];

    			if (temp1_word != arr[j]) {
    				print_word = (arr[c]+arr[j]);

    				for (int f = 0; f < arr.length; f++ ){
    					if (temp1_word != arr[f] && temp2_word != arr[f])
							print_word = (print_word + arr[f]);
					}

    				System.out.println(print_word);
    			}
    		}
			c++;
    	}
    }
}
