package Contest;

public class Program {
    public static void main(String[] args) {
        char[] str = new char[26];

        int cnt = 0;
        for (int i = 97; i < 123; i++) {
            str[cnt] = (char) i;
            cnt++;
        }

        System.out.println("   ");

        for (int i = 0; i < str.length; i++) {
            System.out.println(i + ": " + str[i]);
        }


        String[] words = new String[]{"adc", "wzy", "abc"};
        String[] difference = new String[words.length - 1];

        String[][] words_2 = new String[words.length][words[0].length()];

        int[] int_arr = new int[words[0].length() * words.length];


        char[] char_arr = new char[words[0].length()];


        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i] + " ");

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                char_arr[j] = ch;
                words_2[i][j] = String.valueOf(ch);
//                System.out.println(ch);
            }

            for (int a = 0; a < char_arr.length; a++) {
                System.out.println(char_arr[a] + " " + a);
            }
        }

        System.out.println("!!!!!");

        for (int i = 0; i < words_2.length; i++) {
            for (int j = 0; j < words_2[i].length; j++) {
                System.out.print(words_2[i][j] + " ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < words_2.length; i++) {
            for (int j = 0; j < words_2[i].length; j++) {

                for(int e = 0; e < str.length; e++) {

                    if(String.valueOf(str[e]).equals(words_2[i][j])){
                        System.out.println("e: " + e);
                    }
                }


//                difference[i][j] = words_2[i][j + 1] - words_2[i][j];
            }
        }


    }
}
