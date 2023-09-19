public class Circle {
    private double radius;

    public Circle(double a) {
        this.radius = a;
    }

    public double getCircmunfence() {
        return this.radius * 2 * Math.PI;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public void setRadius(double a) {
        if (a < 0)
            return;
        this.radius = a;
    }

    public double getRadius() {
        return this.radius;
    }
}