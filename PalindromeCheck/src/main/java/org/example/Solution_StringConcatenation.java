package org.example;

/**
 * Hello world!
 *
 */
public class Solution_StringConcatenation
{
    public static boolean isPalindrome(String str) {
        // Write your code here.
        String reverseString = "";

        // Loop through String and concatenate reverse in-place
        for(int i =0; i<str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }

        return reverseString.equals(str);
    }
    public static void main( String[] args )
    {
        String arg1 = "Palindrome";
        String arg2 = "rar";

        System.out.println(Solution_StringConcatenation.isPalindrome(arg1));
        System.out.println(Solution_StringConcatenation.isPalindrome(arg2));
    }
}
