public class Square {

    private double side; // default 0.0; // SONO IL this.side

    public Square(double side) {
        if (side <= 0)
            return;
        this.side = side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            return;
        }
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return this.side * this.side;
    }

}