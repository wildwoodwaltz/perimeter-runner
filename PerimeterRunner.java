import edu.duke.*;

/**
 * Write a description of class Perimeter here.
 *
 * @author Naomi Eirlys
 * @version 2.9.23
 */
public class PerimeterRunner
{

    /**
     * Constructor for objects of class PerimeterRunner
     */
    public double getPerimeter(Shape s)
    {
        // Start with totalPerimeter = 0
        double totalPerimeter = 0;
        // Start with prevPoint = lastPoint
        Point prevPoint = s.getLastPoint();
        //For each point currentPoint in shape,
        for(Point currentPoint: s.getPoints()){
            //Find distance from prevPoint to currentPoint
            double currentDistance = prevPoint.distance(currentPoint);
            //Update totalPerimeter to be totalPerimeter += currentDistance
            totalPerimeter = totalPerimeter + currentDistance;
            //Update prevPoint to be currentPoint
            prevPoint = currentPoint;
        }
            
        //return totalPerimeter
        return totalPerimeter;
    }
    public int getNumPoints(Shape s){
        //ToDo 
        int numPoints = 0;
        //After passing the parameter along, we’ll need to write some language that will allow for this method to return an int that is the number of points in Shape s. This immediately tells us that at some point, we will need to declare an int-type variable to return at the end of this method (review the video about variables and types if you’re having trouble with variable declaration). This variable will be a counter for the number of points within a given shape, s, which means that it will need to be increased for each point in the shape, s. This tells us quite a bit about how we might translate that action into java syntax, namely that we’ll be using some sort of loop. For more information about writing code that iterates over an entire object, see the video “Seven Steps in Action: Translating to Code” and look into the code review for this exercise (Hint: the getPerimeter method has both a for each loop, and a variable that updates after each iteration).
        return numPoints;
    }

    public double getAverageLength(Shape s){
        //ToDo
        double averageLength = 0;
        //Before we can think about what code we would need to write to figure out the average side length for the shape s, we need to understand exactly what we’re trying to calculate, and then translate that to java syntax. In this case, a couple of things that help us, we know that the way to calculate the average side length is the (sum of all sides lengths) / (number of sides). Additionally, we know that the number of sides is equal to the number of points in a two dimensional shape. We already know how to code a method that can calculate the perimeter of a shape, and we know how to code a method that can count the number of points in a shape, so now it’s just a matter of writing a method that can do both and return a double-type variable that is the quotient of those two quantities.

        //One thing to keep in mind, however, is types. It’s important to remember that when you’ll be doing operations on more than one variable, you may need to make sure they’re the same type, or that you’re casting your variables correctly for the operation you’re attempting. For more information on types and casting, see the “Types” video. For example, the getPerimeter method uses double-type variables, and the getNumPoints method uses int-type variables.
        return averageLength;
    }

    public void testPerimeter()
    {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("Perimeter = " + length);
    }
    
    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}   
    