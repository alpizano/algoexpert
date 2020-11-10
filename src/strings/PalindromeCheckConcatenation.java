package strings;

/**
 * Hello world!
 *
 */
public class PalindromeCheckConcatenation
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

        System.out.println(PalindromeCheckConcatenation.isPalindrome(arg1));
        System.out.println(PalindromeCheckConcatenation.isPalindrome(arg2));
    }
}
