import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

        public GeometricObject(){  //constructor
            this.color = "white";
            this.filled = false;
            this.dateCreated = new Date();
        }

        public GeometricObject(String color, Boolean filled){
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean isFilled(){
            return this.filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public Date getdateCreated(){
            return this.dateCreated;
        }

        public String toString(){  //first two lines
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

}
