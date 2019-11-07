
package geometricsandshapelab1;

public class Rectangle {
    
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double area() {
        double area = base * height;
        return area;
    }
    
    public double circumference() {
        double circumference = height*2 + base*2;
        return circumference;
    }

    @Override
    public String toString() {
        return "The Rectangle has the base: " + base + " and the height: " + height + " with area: "+ area()+
                " and circumference: "+circumference();
    }
    
    
    
}
