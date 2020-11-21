
package codingexercises;

public class SumOddRange {
    public static void main(String[] args) {
        int result = sumOdd(2, 6);
         System.out.println("Result =  " + result);
    }
    public static boolean isOdd(int number){
        if(number < 0 || number % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start < 0 || end < 0) || (end < start)){
            return -1;
        }
        boolean oddCheck1 = isOdd(start);
        boolean oddCheck2 = isOdd(end);
        if(oddCheck1 == true && oddCheck2 == true){
            for(int i = start; i <= end; i+=2){
                sum += i;
            }
        }
        else if(oddCheck1 == true && oddCheck2 == false){
            for(int i = start; i <= end-1; i+=2){
                sum += i;
            }
        }
        else if(oddCheck1 == false && oddCheck2 == true){
            for(int i = start+1; i <= end; i+=2){
                sum += i;
            }
        }
        else if(oddCheck1 == false && oddCheck2 == false){
            for(int i = start+1; i <= end-1; i+=2){
                sum += i;
            }
        }
        return sum;
    }
}
