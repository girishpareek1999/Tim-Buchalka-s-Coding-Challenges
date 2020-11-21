
package codingexercises;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123454365));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0, lastDigit = 0;
        while(number > 0){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum = sum + lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }
}
