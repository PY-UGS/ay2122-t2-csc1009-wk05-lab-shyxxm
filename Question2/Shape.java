import java.lang.Math;

abstract class Shape {

    private double dim1;
    private double dim2;
    private  double PI;
    
    public Shape(double dim1, double dim2){ //constructor
        this.dim1 = dim1; //this constructor allows us to set the dim1 and dim2 when it's created
        this.dim2 = dim2;
        this.PI = Math.PI;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public abstract double area();

}
