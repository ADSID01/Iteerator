import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;
    protected Random random = new Random();;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.ints(min, max + 1).findFirst().getAsInt();
            }
        };
    }
}
