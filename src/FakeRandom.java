import java.util.Random;

public class FakeRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.println(i+ ": "+random.nextInt());
        }
    }
}
