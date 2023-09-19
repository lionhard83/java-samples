import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sound.sampled.AudioFileFormat;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        int newInt = 3;
        // System.out.println(ints.contains(newInt));

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Carlo", "Leonardi");
        users.add(user1);
        User user2 = new User("Carlo", "Leonardi");
        System.out.println(user1.equals(user2));
        System.out.println(users.contains(user2));
    }
}
