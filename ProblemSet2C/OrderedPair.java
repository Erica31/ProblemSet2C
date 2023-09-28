
/**
 * OrderedPair code from ProblemSet2B
 *
 * @author Erica Lee
 * @version Sept 25, 2023
 */
public class OrderedPair
{
    double x, y;//instance variables

    public OrderedPair(){
        x = 0;
        y = 0;
    }//constructor 1

    public OrderedPair(double _x, double _y){
        x = _x;
        y = _y;
    }//constructor 2

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
