
/**
 * Main driver with input code and text
 *
 * @author Erica Lee
 * @version Sept 27, 2023
 */
import java.util.Scanner;
public class FormulaDriver
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for "+(int)a+"x^2 + "+(int)b+"x + "+(int)c+" are " + roots);

        //FIND SLOPE
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        OrderedPair p1 = new OrderedPair(x1, y1);
        OrderedPair p2 = new OrderedPair(x2, y2);

        double slope = Formulas.findSlope(p1, p2);
        System.out.println("A line between ("+x1+", "+y1+") and ("+x2+", "+y2+") has a slope of " + slope);

        //FIND MIDPOINT
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");

        System.out.print("x1: ");
        double X1 = input.nextDouble();
        System.out.print("y1: ");
        double Y1 = input.nextDouble();
        System.out.print("x2: ");
        double X2 = input.nextDouble();
        System.out.print("y2: ");
        double Y2 = input.nextDouble();

        OrderedPair MP1 = new OrderedPair(X1, Y1);
        OrderedPair MP2 = new OrderedPair(X2, Y2);

        OrderedPair OrderedPairMP = Formulas.findMidpoint(MP1, MP2);
        System.out.println("The midpoint between ("+X1+", "+Y1+") and ("+X2+", "+Y2+") is " + OrderedPairMP);

        //SUM OF AN ARITHMETIC SERIES
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int nT = input.nextInt();
        System.out.print("Starts with: ");
        double start = input.nextDouble();
        System.out.print("Increases by: ");
        double inc = input.nextDouble();

        double sum = Formulas.findArithmeticSeriesSum(inc, start, nT);
        System.out.println("The sum of the first "+nT+" terms of an arithmetic series that starts with "+start+" and increases by "+inc+" is "+sum);

        //SUM OF A GEOMETRIC SERIES
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int nTg = input.nextInt();
        System.out.print("Starts with: ");
        double startg = input.nextDouble();
        System.out.print("Rate of growth: ");
        double growth = input.nextDouble();

        double sumG = Formulas.findGeometricSeriesSum(startg, growth, nTg);
        System.out.println("The sum of the first "+nTg+" terms of a finite geometric series that starts with "+startg+" and increases by a rate of "+growth+" is "+sumG);

        //DIE ROLLER
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int numSides = input.nextInt();
        System.out.print("Rolling a "+numSides+"-sided die... ");
        
        int num = Formulas.rollDie(numSides);
        System.out.println("you got a "+num+"!");

    }
}
