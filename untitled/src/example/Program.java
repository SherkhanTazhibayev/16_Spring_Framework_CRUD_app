package example;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[][] array = {
                //                {6, 5, 4, 7, 8, 2},
//                {2, 3, 3, 5, 6, 9}

//                {2, 8, 7, 4, 5, 6},
//                {9, 6, 5, 3, 3, 2}

//                {8, 3, 4, 10, 7, 7},
//                {9, 5, 6, 9, 4, 5}

                {8, 3, 4, 10, 7, 7},
                {9, 5, 6, 9, 4, 5},
        };
        searchWorkTime(array);
    }

    public static void searchWorkTime(int[][] array) {
        int b = array[0][0];
        for (int i = 1; i <= array[0].length - 1; i++) {
            int t = 0;

            for (int k = 0; k <= i; k++) {
                t += array[0][k];
            }

            for (int l = 0; l <= i - 1; l++) {
                if (i == 5) {
                };
                t -= array[1][l];
            }

            if (b < t) {
                b = t;
            }
        }
        ;
        System.out.println(b);

        int cnt = 0;
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                cnt = cnt + array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");

        System.out.println("b: " + b);
        System.out.println("cnt: " + cnt);
        int result = cnt + b;
        System.out.println("cnt: " + result);


    }
}
