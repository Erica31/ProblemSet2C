
/**
 * Formula class with all formulas and operations
 *
 * @author Erica Lee
 * @version Sept 27, 2023
 */
public class Formulas
{
    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        double answer1 = (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c))) / (2*a);
        double answer2 = (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c))) / (2*a);
        
        OrderedPair answer = new OrderedPair(answer1,answer2);
        return answer;
    }
    public static double findSlope(OrderedPair A, OrderedPair B){
        double s = (B.getY()-A.getY())/(B.getX()-A.getX());
        
        return s;
    }
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double ans1 = ((A.getX() + B.getX())/2);
        double ans2 = ((A.getY() + B.getY())/2);
        
        OrderedPair ans = new OrderedPair(ans1,ans2);
        return ans;
    }
    public static double findArithmeticSeriesSum (double a, double d, int k){
        double aSum = (k/2.0)*((2*a)+(d*(k-1)));

        return aSum;
    }
    public static double findGeometricSeriesSum (double a, double r, int k){
        double gSum = a*((1-Math.pow(r, k))/(1-r));
        
        return gSum;
    }
    public static int rollDie (int sides){
        int randomNum = (((int)Math.random()*sides)+1);
        
        return randomNum;
    }
}
