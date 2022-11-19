package beka;

public class program {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };

        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        System.out.println("_____________");

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.println("nums2[i][j]: " + nums2[i][j]);
            }
        }
    }
}
