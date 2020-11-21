
package codingexercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int left, int right){
        if((left < 10 || left > 99) || (right < 10 || right > 99)){
            return false;
        }
        int l2 = left % 10;
        int l1 = left / 10;
        int r2 = right % 10;
        int r1 = right / 10;
        if((l2 == r2) || (l2 == r1) || (l1 == r2) || (l1 == r1)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
