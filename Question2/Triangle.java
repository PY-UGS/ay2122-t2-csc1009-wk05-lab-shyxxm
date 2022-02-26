public class Triangle extends Shape {
    
    // public Triangle(){
    //     super();
    // }
    
    public Triangle(double dim1, double dim2){
          super(dim1,dim2);
    }

    public double area(){
        System.out.print("Inside Area for Triangle.\n");
        double answer = 0.5 * super.getDim1() * super.getDim2();
        return answer;
    }

}
