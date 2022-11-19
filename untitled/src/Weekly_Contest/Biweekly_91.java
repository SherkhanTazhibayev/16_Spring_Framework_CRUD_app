package Weekly_Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Biweekly_91 {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,100};
        int[] nums = new int[]{4,1,4,0,3,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        HashSet<Float> set = new HashSet<>();

        for (int i = 0; i < nums.length / 2; i++) {
            Collections.sort(list);
            set.add( ( (float)(list.get(0) + list.get(list.size() - 1)) / 2));
            list.remove(0);
            list.remove(list.size() - 1);
        }
        System.out.println(set.size());
    }
}
