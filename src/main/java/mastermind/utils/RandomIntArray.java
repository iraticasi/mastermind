package mastermind.utils;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {

    public static int[] generate(boolean duplicates, int limit, int length) {
        assert (duplicates || (limit >= length));
        Random random = new Random(System.currentTimeMillis());
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            int next;
            do {
                next = random.nextInt(limit);
            } while (!duplicates && ArrayUtils.contains(Arrays.copyOfRange(intArray, 0, i), next));
            intArray[i] = next;
        }
        return intArray;
    }

    public static int[] generateWithDuplicates(int limit, int length) {
        return generate(true, limit, length);
    }

    public static int[] generateWithoutDuplicates(int limit, int length) {
        assert (limit >= length);
        return generate(false, limit, length);
    }

}
