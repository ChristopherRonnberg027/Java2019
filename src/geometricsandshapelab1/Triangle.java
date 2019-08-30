
package geometricsandshapelab1;

public class Triangle {
    
    private double katetA;
    private double katetB;

    public Triangle() {
    }

    public Triangle(double katetA, double katetB) {
        this.katetA = katetA;
        this.katetB = katetB;
    }
    
    public double area() {
        double area = (katetA * katetB) / 2;
        return area;
    } 
    
}
