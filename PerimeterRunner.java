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
        return numPoints;
    }

    public double getAverageLength(Shape s){
        //ToDo
        double averageLength = 0;

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
    