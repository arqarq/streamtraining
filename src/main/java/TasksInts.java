import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TasksInts {

    public void execute() {
        int[] knownArrayOfInts = getArrayOfInts();
        int[] knownArrayOfRandomInts = getArrayOfRandomPositiveInts(100000);

        Integer maxElement1 = findMaxElement(knownArrayOfInts);
        System.out.println("Max element from known list is " + maxElement1);
        Integer maxElement2 = findMaxElement(knownArrayOfRandomInts);
        System.out.println("Max element from random list is " + maxElement2);

        Integer minElement1 = findMinElement(knownArrayOfInts);
        System.out.println("Min element from known list is " + minElement1);
        Integer minElement2 = findMinElement(knownArrayOfRandomInts);
        System.out.println("Min element from random list is " + minElement2);

        Integer minFifthElement1 = findMinElement(knownArrayOfInts, 5);
        System.out.println("Min 5th element from known list is " + minFifthElement1);
        Integer min500thElement2 = findMinElement(knownArrayOfRandomInts, 500);
        System.out.println("Min 500th element from random list is " + min500thElement2);

        Integer sumOfElement = sum(knownArrayOfInts);
        System.out.println("Sum of elements from known list is " + sumOfElement);

    }

    public Integer findMaxElement(int[] ints) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Integer findMinElement(int[] ints) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Integer findMinElement(int[] ints, int skippedAmount) {
        throw new UnsupportedOperationException("Todo.");
    }

    public Integer sum(int[] ints) {
        throw new UnsupportedOperationException("Todo.");
    }

    private int[] getArrayOfInts() {
        return new int[] {6126,717,226,83,2,8,327,23475,17,723,47632};
    }

    private int[] getArrayOfRandomPositiveInts(int amountOfInts) {
        int[] integers = new int[amountOfInts];
        Random random = new Random();
        for (int i = 0; i < amountOfInts; i++) {
            int randomInt = random.nextInt();
            randomInt = randomInt > 0 ? randomInt : randomInt * (-1);
            integers[i] = randomInt;
        }
        return integers;
    }

}
