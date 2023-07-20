public class Shape {
        /** This will be used as a super class */
    protected double area;

    public Shape(double height, double width) {
        area = height*width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
