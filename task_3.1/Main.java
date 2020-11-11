
public class Main {
    
    static int min(int a, int b, int c) {

    	int result;

    	if ((a <= b) && (a <= c) ){
    		result = a; 
    	} else if ((b <= c) && (b <= a)) {
    		result = b; 
    	} else result = c;

        return result;
       }

    public static void main(String[] args) {
        
		System.out.println(min(1, 2, 3));     
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
