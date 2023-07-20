public class Rectangle extends Shape{
    private double perimeter;

    public Rectangle(double height, double width) {
        super(height, width);


        this.perimeter = 2*(height+width);
        //area = height*width;
        //setArea(height*width);
    }
    public double getPerimeter() {
        return perimeter;
    }
}
