public class Circle {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    public double circumference() {
        return 6.28 * this.radius;
    }
}
