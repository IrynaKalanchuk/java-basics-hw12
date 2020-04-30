import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> Math.abs(n) % 2 == 1).sorted().toArray();
    }
}