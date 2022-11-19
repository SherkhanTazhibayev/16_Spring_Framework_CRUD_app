package Weekly_Contest;

public class Program {
    public static void main(String[] args) {
        long n = 16;
        int target = 6;

        String numStr = String.valueOf(n);
        int retArr[] = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            int digit = c;
            int zero = (char) '0';
            retArr[i] = digit - zero;
        }

        int sum = 0;

        for (int i = 0; i < retArr.length; i++) {
            sum += retArr[i];
            // System.out.println("d: " + retArr[i]);
        }

        while (sum >= target) {
            System.out.println(n);
            String numStr_2 = String.valueOf(n);
            int retArr_2[] = new int[numStr_2.length()];

            for (int i = 0; i < numStr_2.length(); i++) {
                char c_2 = numStr_2.charAt(i);
                int digit_2 = c_2;
                int zero_2 = (char) '0';
                retArr_2[i] = digit_2 - zero_2;
            }
            n++;

            for (int i = 0; i < retArr.length; i++) {
                sum += retArr[i];
            }

        }


    }
}
