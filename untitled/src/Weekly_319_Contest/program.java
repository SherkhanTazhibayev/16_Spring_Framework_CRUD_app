package Weekly_319_Contest;

import java.util.ArrayList;
import java.util.HashSet;

public class program {
    public static void main(String[] args) {

//        double celsius = 36.50;
//        double Kelvin = celsius + 273.15;
//        double Fahrenheit = celsius * 1.80 + 32.00;
//
//        double[] ans = new double[2];
//        ans[0] = Kelvin;
//        ans[1] = Fahrenheit;
//
//
//        ArrayList<Double> list = new ArrayList<Double>();
//        list.add(Kelvin);
//        list.add(Fahrenheit);
//
//        Integer[] arr = new Integer[list.size()];
//        arr = list.toArray(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println();
//        }
//
//        System.out.println(Kelvin);
//        System.out.println(Fahrenheit);

        int[] nums = new int[]{3, 6, 2, 7, 1};
//        int[] nums = new int[]{3};
        int k = 6;

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((k / nums[i]) > 0 && nums[i] != 1) {
                list.add(nums[i]);
//                set.add(nums[i]);
                cnt++;
            }
        }

        System.out.println(cnt);
        System.out.println(list);
//        System.out.println(set);

        int i, fact = 1;
        int number = list.size(); //It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("fact: " + fact);
    }
}
