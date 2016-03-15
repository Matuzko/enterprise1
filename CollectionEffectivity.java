package enterprise1;


import java.util.ArrayList;
import java.util.Random;

public class CollectionEffectivity {
    static public long addEffectivity(ArrayList arrayList, int numberOfChanges) {
        long[] results = new long[numberOfChanges];
        long start, stop, effectivity, finalefect = 0;
        Random random = new Random();

        for (int i = 0; i < numberOfChanges; i++) {
            int value = random.nextInt(numberOfChanges);
            start = System.nanoTime();
            arrayList.add(value);
            stop = System.nanoTime();
            effectivity = stop - start;
            results[i] = effectivity;
        }
        for (long l : results
                ) {
            finalefect += l;
        }


        return finalefect / numberOfChanges;

    }
}

