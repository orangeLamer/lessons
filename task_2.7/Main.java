
public class Main {

    public static void main(String[] args) {

int a = 31;

boolean s_bul = true;

        if (s_bul) {

            for (int i = 2; i < a; i++) {
                         
                int tmp_num = a % i;
                 int chek_num = a / i;
                    if (tmp_num != 0) {
                            
                            s_bul = false;
                            break;
                        } 
                }
        }
        System.out.println(s_bul);

    }
}
