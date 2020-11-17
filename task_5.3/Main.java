import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(25);
        nums.add(7);
        nums.add(95);
        nums.add(5);
        nums.add(4);
        nums.add(798);
        nums.add(2);

        System.out.println(nums);
        ArrayList<Integer> select_nums = new ArrayList<>();
        for(int i = 0; i <= (nums.size()-1); i++ ){
            if(nums.get(i) < 10)
                select_nums.add(nums.get(i));
        }

        System.out.println(select_nums);

   }
}
