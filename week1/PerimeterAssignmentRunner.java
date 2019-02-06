import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int numPoints = 0;
        for(Point p : s.getPoints()){
            numPoints++;
        }
        // returs the number of points
        return numPoints;
    
    }

    public double getAverageLength(Shape s) {
        // Put code here
        Point lastPoint = s.getLastPoint(); 
        Double l = 0.0;
        
        int total = 0;
        for(Point p : s.getPoints()){
            l += p.distance(lastPoint);
            lastPoint = p;
            total++;            
        }
        return l/total;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double longestSide;
        Point lastPoint = s.getLastPoint();
        double largestSide = 0.0;
        
        for(Point p : s.getPoints()){
            if(largestSide < p.distance(lastPoint)){
                largestSide = p.distance(lastPoint);     
            }
            lastPoint = p;
            
        }
        
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // Put code here
        int largestX = 0;
        for(Point p : s.getPoints()){
            if( largestX < p.getX()){
                largestX = p.getX();
            }
            
        }        
        
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("number of points = "+getNumPoints(s));
        System.out.println("length average = "+getAverageLength(s));
        System.out.println("Largest side = "+ getLargestSide(s));
        System.out.println("Largest x = " + getLargestX(s));
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
