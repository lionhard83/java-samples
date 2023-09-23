import java.util.ArrayList;

public class Club {
    private String name;
    private double budget = 0;
    private ArrayList<Field> fields = new ArrayList<>();

    public Club(String name) {
        this.name = name;
    }

    public void addField(String name, String type, double price) {
        Field f = new Field(type, name, price);
        this.fields.add(f);
    }

    public boolean addReservation(String nameOfField, String name, String date, String start, String end) {
        for (Field f : this.fields) {
            if (f.getName().equals(nameOfField)) {
                f.addReservation(name, date, start, end);
                this.budget += f.getPrice();
                return true;
            }
        }
        return false;
    }

    public String getReservationByField(String nameOfField) {
        for (Field f : this.fields) {
            if (f.getName().equals(nameOfField)) {
                return f.getReservation();
            }
        }
        return "Campo non esiste";
    }

    public double getBudget() {
        return budget;
    }
}
