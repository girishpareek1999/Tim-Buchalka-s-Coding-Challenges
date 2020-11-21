
package codingexercises;

public class sumEvenRange {
    public static void main(String[] args) {
        int result = getEvenDigitSum(11);
        System.out.println("result = " + result);
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number > 0){
            for(int i = 2; i <=number; i+=2){
                System.out.println("In the background sum = " + sum + " and i = " + i);
                sum += i;
                System.out.println("sum = " + sum);
            }
            return sum;
        }
        else{
            return -1;          
        }
    }
}
