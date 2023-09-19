public class Main3 {
    static String value = "Fausto";

    public static void main(String[] args) {
        Race r = new Race(5);
        r.addCar(new Car("Ferrari"));
        r.addCar(new Car("Red Bull"));
        r.addCar(new Car("Mercedes"));
        r.addCar(new Car("McLaren"));
        r.go();

    }
}
