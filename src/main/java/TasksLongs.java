import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TasksLongs {

    public void execute() {
        List<Long> knownArrayOfLongs = getListOfLongs();
        List<Long> knownArrayOfRandomLongs = getListOfRandomPositiveLongs(100000);

        Long maxElement1 = findMaxElement(knownArrayOfLongs);
        System.out.println("Max element from known list is " + maxElement1);
        Long maxElement2 = findMaxElement(knownArrayOfRandomLongs);
        System.out.println("Max element from random list is " + maxElement2);


        Long minElement1 = findMinElement(knownArrayOfLongs);
        System.out.println("Min element from known list is " + minElement1);
        Long minElement2 = findMinElement(knownArrayOfRandomLongs);
        System.out.println("Min element from random list is " + minElement2);

        Double medianElement1 = findMedianElement(knownArrayOfLongs);
        System.out.println("Median element from known list is " + medianElement1);
        Double medianElement2 = findMedianElement(knownArrayOfRandomLongs);
        System.out.println("Median element from random list is " + medianElement2);

        Long countGreaterThen1 = countLongsGreaterThen(knownArrayOfLongs, 1000L);
        System.out.println("Amount of elements greater then 1000 is " + countGreaterThen1);
        Long countGreaterThen2 = countLongsGreaterThen(knownArrayOfRandomLongs, Long.MAX_VALUE / 2);
        System.out.println("Amount of random elements greater then 1000000000 is " + countGreaterThen2);
    }

    public Long findMaxElement(List<Long> longs) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Long findMinElement(List<Long> longs) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Double findMedianElement(List<Long> longs) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Long countLongsGreaterThen(List<Long> longs, Long minimalLongValue) {
        throw new UnsupportedOperationException("Todo.");
    }

    private List<Long> getListOfLongs() {
        List<Long> longs = new ArrayList<>();
        longs.add(1251L);
        longs.add(716L);
        longs.add(2616L);
        longs.add(2L);
        longs.add(172L);
        longs.add(95L);
        longs.add(723L);
        longs.add(307L);
        longs.add(251L);
        longs.add(628L);
        longs.add(1232L);
        return longs;
    }

    private List<Long> getListOfRandomPositiveLongs(int amountOfLongs) {
        List<Long> longs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfLongs; i++) {
            long randomLong = random.nextLong();
            randomLong = randomLong > 0 ? randomLong : randomLong * (-1);
            longs.add(randomLong);
        }
        return longs;
    }

}
