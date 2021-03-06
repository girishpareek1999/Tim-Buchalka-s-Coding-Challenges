
package codingexercises;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(5445);
    }
    
    public static void numberToWords(int number){
        if(number >= 0){
            int reversed = reverse(number);
            int numberOfdigits = getDigitCount(number);
            for(int i = 0; i < numberOfdigits; i++){

                int digit = reversed % 10;
                
                switch(digit){
                    case 0:
                        System.out.print(" Zero");
                        break;
                    case 1:
                        System.out.print(" One");
                        break;
                    case 2:
                        System.out.print(" Two");
                        break;
                    case 3:
                        System.out.print(" Three");
                        break;
                    case 4:
                        System.out.print(" Four");
                        break;
                    case 5:
                        System.out.print(" Five");
                        break;
                    case 6:
                        System.out.print(" Six");
                        break;
                    case 7:
                        System.out.print(" Seven");
                        break;
                    case 8:
                        System.out.print(" Eight");
                        break;
                    case 9:
                        System.out.print(" Nine");
                        break;
                       
            };
            reversed = reversed / 10;
            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    
    public static int reverse(int number){
        int reversedNumber = 0;
        int lastDigit = 0;
        while(number != 0){
            lastDigit = number % 10;
            reversedNumber = reversedNumber*10 + lastDigit;
            number = number / 10;
        }
        
        return reversedNumber;
    }
    
    public static int getDigitCount(int number){
        int count = 0;
        if(number < 0){
            return -1;
        }
        if(number == 0){
            count = 1;
        }
        while(number > 0){
            number = number / 10;
            count++;
        }
        return count;
        
    }
}
