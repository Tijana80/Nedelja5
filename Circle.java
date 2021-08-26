
package sreda1;

public class Circle extends Shape{
  
   private double r;

    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }



   

    @Override
    public String toString() {
        return "";
    }

    @Override
    public double circumference() {
        double x=r*r*Math.PI;
       return x;
    }

    @Override
    public double area() {
       double y=2*r*Math.PI;
       return y;
    }

}
