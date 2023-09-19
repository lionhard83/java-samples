import java.util.ArrayList;

public class Race {
    ArrayList<Car> cars = new ArrayList<>();
    int laps = 10;
    int carsFinished = 0;

    public Race() {
        this.carsFinished = 0;
    }

    public Race(int laps) {
        this.laps = laps;
        this.carsFinished = 0;
    }

    public void checkIfIsCompleted() {
        if (this.carsFinished == this.cars.size()) {
            System.out.println("La gara è finita");
        }
    }

    public void addCar(Car car) {
        car.setRace(this);
        this.cars.add(car);
    }

    public void go() {
        for (Car c : this.cars) {
            c.start();
        }
    }
}
