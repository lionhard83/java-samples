import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array0 = new ArrayList<>(Arrays.asList(2, 3));
        HandleArray ah0 = new HandleArray(array0);
        // System.out.println(ah0.getAverage());

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 3, 5, 4, 9, 10, 11));
        HandleArray ah = new HandleArray(array);
        // System.out.println(ah.getAverage());

        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(7, 6, 5));
        HandleArray ah2 = new HandleArray(array2);
        // System.out.println(ah2.getAverage());

        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(-7, -6, -5));
        HandleArray ah3 = new HandleArray(array3);
        // System.out.println(ah3.getAverage());

        ArrayList<Integer> array4 = new ArrayList<>();
        HandleArray ah4 = new HandleArray(array4);
        // System.out.println(ah4.getAverage());

        ArrayList<Integer> array5 = new ArrayList<>(Arrays.asList(2, 1));
        HandleArray ah5 = new HandleArray(array5);

        // System.out.println(ah5.getAverage());

    }
}
