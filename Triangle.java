public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public Triangle(double base, double height, String angle) {
        double a = Double.parseDouble(angle);
        sideA = base;
        sideB = height / Math.cos(Math.toRadians(Double.parseDouble(angle)));
        sideC = height / Math.sin(Math.toRadians(Double.parseDouble(angle)));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public String toString() {
        return "{ \nsideA: " + sideA +
                "\n" + "sideB: " + sideB + "\n"
                + "sideC:" + sideC
                + "perimeter: " + getPerimeter()
                + "\n }\n";
    }
}