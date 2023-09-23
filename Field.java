import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field {
    private String type;
    private double price;
    private String name;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Field(String type, String name, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void addReservation(String name, String date, String start, String end) {
        Reservation r = new Reservation(name, date, start, end);
        this.reservations.add(r);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getReservation() {
        String str = "";
        for (Reservation r : this.reservations) {
            str += r.toString() + "\n";
        }
        return str;
    }

}
