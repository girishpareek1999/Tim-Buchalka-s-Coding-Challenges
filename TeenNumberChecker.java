
package codingexercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int n1, int n2, int n3){
        if(n1 >=13 && n1 <= 19 || n2 >=13 && n2 <= 19 || n3 >=13 && n3 <= 19){
            System.out.println("Teen Encountered");
            return true;
        }
        else{
            System.out.println("Teen not  Encountered");
            return false;
        }
            
    }
    public static boolean isTeen(int n1){
        if(n1 >=13 && n1 <= 19){
            System.out.println("Teen Encountered");
            return true;
        }
        else{
            System.out.println("Teen not  Encountered");
            return false;
        }
                
    }
}
