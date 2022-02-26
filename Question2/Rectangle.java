public class Rectangle extends Shape {
    
    public Rectangle(double dim1, double dim2){
        //super(dim1,dim2);
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area(){
        System.out.print("Inside Area for Rectangle.\n");
        return super.getDim1()*super.getDim2();
    }
}
