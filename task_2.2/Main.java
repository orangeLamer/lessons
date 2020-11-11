
public class Main {

    public static void main(String[] args) {
	

        String temp_line = "";
        for (int i=1;i <= 10;i++){

            for(int j=1; j<=10; j++){

                temp_line = (temp_line + i*j + " ");
            }
            System.out.println(temp_line);
            temp_line = "";
        }
    }
}
