public class Ellipse extends Shape {
    
    public Ellipse(double dim1, double dim2){
        super(dim1,dim2);
    }

    public double area(){
        System.out.print("Inside Area for Ellipse.\n");
        return (super.getPI() * super.getDim1() * super.getDim2() * 100)/100;
    }
}
