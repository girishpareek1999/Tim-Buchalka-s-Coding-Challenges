
package codingexercises;


public class LastDigitChecker {
     public static boolean hasSameLastDigit(int left, int right, int center){
        if((left < 10 || left > 1000) || (right < 10 || right > 1000) || (center < 10 || center > 1000)){
            return false;
        }
        int l2 = left % 10;
        
        int r2 = right % 10;
       
        int c2 = center % 10;
        if(l2 == r2 || l2 == c2 || r2 == c2){
            return true;
        }
        else{
            return false;
        }
    }
     public static boolean isValid(int number){
         if(number < 10 || number > 1000){
             return false;
         }
         else{
             return true;
         }
     }
}
