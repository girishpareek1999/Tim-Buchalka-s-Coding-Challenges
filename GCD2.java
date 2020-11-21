
package codingexercises;

public class GCD2 {
    public static void main(String[] args) {
        System.out.println(getGCD(30, 50));

    }
    public static int getGCD(int a, int b){
        if(a < 10 || b < 10){
            return -1;
        }
        int big = Integer.max(a, b);
        int i;
        for(i =(int)Math.sqrt(big); i > 1; i--){
            if((a % i == 0) && (b % i == 0)){
                break;
            }
        }
        return i;
    }
}
