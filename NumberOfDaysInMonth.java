
package codingexercises;


public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int result = getDaysInMonth(2, 1600);
        System.out.println(result);
        result = getDaysInMonth(2, 1901);
        System.out.println(result);
        result = getDaysInMonth(9, 1999);
        System.out.println(result);
        result = getDaysInMonth(13, 2002);
        System.out.println(result);
    }
     public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        else 
            return((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
     }
     public static int getDaysInMonth(int month, int year){
     if(month < 1 || month > 12 || year < 1 || year > 9999){
         return -1;
     }
     boolean yearCheck = isLeapYear(year);
     if(yearCheck){
         if(month == 2){
            return 29;
         }
         else if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 ||month == 10 ||month == 12 ){
             return 31;
         }
         else{
             return 30;
         }
     }
     else{
         if(month == 2){
            return 28;
         }
         else if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 ||month == 10 ||month == 12 ){
             return 31;
         }
         else{
             return 30;
         }
     }
     }
}
