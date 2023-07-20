public class Square extends Shape{
    private double perimeter;
    public Square(double height, double width) {
        super(height, width);
        this.perimeter = 4*height;

        //area = height*width;
        //setArea(height*width);

    }

    public double getPerimeter() {
        return perimeter;
    }
}
