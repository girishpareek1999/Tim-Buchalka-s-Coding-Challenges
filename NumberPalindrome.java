
package codingexercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome(1721);
        System.out.println(result);
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        while(number > 0 ||  number < 0){
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse*10 + lastDigit;
        }
        if(originalNumber == reverse){
            return true;
        }
        else{
            return false;
        } 
    }
}
