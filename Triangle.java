
package sreda1;

public class Triangle extends Shape {
  private double a;
  private double b;
    private double c;

    public Triangle(double a, double b, double c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() { double s=(a+b+c)/2;
    double x=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      return x;
    }

    @Override
    public double circumference() {double y=a+b+c;
       return c;
              
    
    
    

    }

    


    
   

    @Override
    public String toString() {
        return "Triangle{" + "c=" + c + '}';
    }


   
}
