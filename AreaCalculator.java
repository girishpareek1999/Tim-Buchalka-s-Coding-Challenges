
package codingexercises;

public class AreaCalculator {
    public static void main(String[] args) {
        double d1 = area(22);
        double d2 = area(15, 25);
        double d3 = area(-15, 25);
        System.out.println(+ d1 + "\n" + d2 + "\n" + d3);
    }
    public static double area(double radius){
        if(radius < 0)
        {
            return -1d;
        }
        double area = radius * radius * Math.PI;
        return area;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0)
        {
            return -1d;
        }
        double area = x * y;
        return area;
    }
}
