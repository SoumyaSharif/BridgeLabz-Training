package week3.day11.classworkquestions;

public class PalindromeCheck {
    public static  boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
     public static void main(String[] args) {
        String st = "aba";
        System.out.println(isPalindrome(st));
    }
}
