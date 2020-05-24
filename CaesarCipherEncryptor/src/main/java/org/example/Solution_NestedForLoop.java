package org.example;

/**
 * Hello world!
 *
 */
public class Solution_NestedForLoop
{
    // Implementing with nested for loop
    // time complexity O(n^2)
    // space complexity O(n)
    public static String caesarCypherEncryptor(String str, int key) {
        String encryptedString = "";

        for(int i=0; i<str.length(); i++) {
            char char_tmp = str.charAt(i);
            int int_tmp = char_tmp;

            for(int j=0; j<key; j++) {
                // shift before checking
                int_tmp++;

                if(int_tmp > 122) {
                    // reset loop back to beginning, 'a' or 97
                    int_tmp = 97;
                }
            }
            char tmp2 = (char) int_tmp;
            encryptedString = encryptedString + tmp2;
        }

        return encryptedString;

    }
    public static void main( String[] args )
    {
        String test = "z";
        char test2 = 'a';
        int test3 = 122;
        String input = "xyz";

        // can inter-convert between int and ascii char value
        System.out.println((int)test2);
        System.out.println((char)test3);

        System.out.println(Solution_NestedForLoop.caesarCypherEncryptor(input,2));
    }
}
