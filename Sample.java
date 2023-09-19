public class Sample {
    public static void main(String[] args) {
        // System.out.println("Pippo");
        // String x = "Ciao";

        // double s = 3.4;
        // Triangle t1 = new Triangle(2.0, 5.0, 7.0);
        // System.out.println(t1.getPerimeter());
        // t1.sideA = 4.9;
        // System.out.println(t1.getPerimeter());
        Triangle t2 = new Triangle(3, 18, 7);
        Triangle t1 = new Triangle(2, 4, "45");
        System.out.println(t1);

        System.out.println(t2);
        // Square s1 = new Square(-5.0);
        // s1.setSide(3.0);
        // System.out.println(s1.getArea());
        // System.out.println(s1.getPerimeter());
        // System.out.println(s1.getSide());

        // if (t1.getPerimeter() > t2.getPerimeter()) {
        // System.out.println("t1 è maggiore");
        // } else {
        // System.out.println("t2 è maggiore");
        // }
    }

    public static String getType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilatero";
        } else if (a == b || b == c || c == a) {
            return "Isoscele";
        }
        return "Scaleno";
    }

}

// CUBO
// PARALLELOGRAMMA
// SFERA
// CILINDRO
// CONO
