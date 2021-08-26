
package sreda1;


public class Rectangle extends Shape {
    private double a,b;

    public Rectangle(double a, double b, String name) {
        super(name);
        this.a = a;
        this.b = b;
    }
    

    @Override
    public double circumference() {double y=2*a + 2*b;
       return y;}

    @Override
    public double area() {double x=a*b;
      return x;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
