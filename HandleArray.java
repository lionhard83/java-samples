import java.util.ArrayList;

public class HandleArray {
    private ArrayList<Integer> myArr;

    public HandleArray(ArrayList<Integer> arr) {
        this.myArr = arr;
        System.out.println(this.myArr.contains(3));
    }

    public int getMax() {
        return getExtreme(true);
    }

    public int getMin() {
        return getExtreme(false);
    }

    private int getExtreme(boolean isMax) {
        if (this.myArr.size() == 0) {
            return 0;
        }
        int extreme = this.myArr.get(0);
        for (int item : this.myArr) {
            if (isMax ? item > extreme : item < extreme) {
                extreme = item;
            }
        }
        return extreme;
    }

    public int getSum() {
        int sum = 0;
        for (int item : this.myArr) {
            sum += item;
        }
        return sum;
    }

    public int getMaxIncrementSequence() {
        return this.getMaxSequence(true);
    }

    public int getMaxDecrementSequence() {
        return this.getMaxSequence(false);
    }

    private int getMaxSequence(boolean increment) {
        if (this.myArr.size() <= 1) {
            return this.myArr.size();
        }
        int maxSequence = 1;
        int counter = 1;
        for (int i = 0; i < this.myArr.size() - 1; i++) {
            if (increment ? this.myArr.get(i) < this.myArr.get(i + 1) : this.myArr.get(i) > this.myArr.get(i + 1)) {
                counter++;
                if (counter > maxSequence) {
                    maxSequence = counter;
                }
            } else {
                counter = 1;
            }
        }
        return maxSequence;

    }

    public double getAverage() {
        return this.myArr.size() == 0 ? 0 : (double) this.getSum() / this.myArr.size();
    }

    public void addNumber(int num) {
        this.myArr.add(num);
    }

}
