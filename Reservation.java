public class Reservation {
    private String name;
    private String date;
    private String start;
    private String end;

    public Reservation(String name, String date, String start, String end) {
        this.name = name;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return name + " " + date + " " + start + " " + end;
    }
}
