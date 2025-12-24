import java.util.*;

public class Palindrome{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean palindrome = isPalindrome(s);
        if(palindrome){
        System.out.println("It's Palindrome");
        }
        else{
        System.out.println("It's not a Palindrome");
        }

    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length()- 1;
	while (left < right) {
	    if (input.charAt(left) != input.charAt(right)) {
	    return false;
	}
	left++;
	right--;
        }
        return true;
    }
}