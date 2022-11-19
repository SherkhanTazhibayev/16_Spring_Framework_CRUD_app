package Weekly_318_Contest;


import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int[] nums = new int[]{847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272};
//        int[] nums = new int[]{0, 1};

        if (nums.length == 2 && ((nums[0] == 0) || (nums[1] == 0))) {
            int temp = nums[1];
            nums[1] = nums[0];
            nums[0] = temp;
//            return nums;
        }

        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        for (int i = list.size(); i < nums.length; i++) {
            list.add(nums[i] = 0);
        }

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = list.get(i);
////            System.out.print(nums[i] + " ");
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }


    }
}
