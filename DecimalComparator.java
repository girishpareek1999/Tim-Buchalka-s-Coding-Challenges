package codingexercises;
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){
        if((int)(n1 * 1000) == (int)(n2 * 1000)){
            return true;
        }
        else{
            return false;
        }
    }
}
