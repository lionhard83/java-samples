public class Car extends Thread {

    int lap = 0;
    Race race;

    public Car(String str) {
        super(str);
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void run() {

        while (lap < this.race.laps) {
            try {
                sleep((int) (Math.random() * 1000));
                lap++;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Ho completato il percorso:" + this.getName());
        this.race.carsFinished++;
        this.race.checkIfIsCompleted();
    }
}
