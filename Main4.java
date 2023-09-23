public class Main4 {
    public static void main(String[] args) {
        Club c = new Club("City Padel");
        c.addField("P1", "Padel", 40);
        c.addField("P2", "Padel", 40);
        c.addField("P3", "Padel", 40);
        c.addField("F1", "Futsal", 50);
        c.addReservation("P1", "Leonardi", "23/09/2023", "18.00", "19.30");
        c.addReservation("P1", "Leonardi", "23/09/2023", "19.30", "21.00");

        System.out.println("budget:" + c.getBudget());
        System.out.println(c.getReservationByField("P1"));
    }
}
