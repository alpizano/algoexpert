package org.example;

/**
 * Hello world!
 *
 */
public class Solution_StringConcatenation
{

    public static void main( String[] args )
    {
        String test = "Palindrome";
        String reverse = "";

        for(int i =0; i<test.length(); i++) {
            reverse = test.charAt(i) + reverse;
        }

        System.out.println(reverse);
    }
}
