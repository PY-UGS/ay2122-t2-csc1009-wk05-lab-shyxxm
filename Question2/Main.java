import java.text.DecimalFormat;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e =  new Ellipse(7,7);
        Square s = new Square(6,6);
        
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
    
        figref = t;
        System.out.println("Area is " + figref.area());
    
        figref =  c;
        System.out.println("Area is " + df.format(figref.area()));
    
        figref = e;
        System.out.println("Area is " + df.format(figref.area()));

        figref = s;
        System.out.println("Area is " + figref.area());
    
    }
    
}
