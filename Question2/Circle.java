public class Circle extends Shape {
    
    public Circle(double dim1, double dim2){
        super(dim1,dim2);
    }

    public double area(){
        System.out.print("Inside Area for Circle.\n");
        return getPI() * (super.getDim1() * super.getDim2());
    }
}
