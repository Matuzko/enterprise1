package enterprise1;

import java.util.*;


public class CollectionsActs {
    public static void fill(ArrayList arraylist, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arraylist.add(random.nextInt(size * 2));
        }
    }

    public static void fill(LinkedList linkedlist, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedlist.add(random.nextInt(size * 2));
        }
    }

    public static void fill(HashSet hashSet, int size) {
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }
    }

    public static void fill(TreeSet treeSet, int size) {
        for (int i = 0; i < size; i++) {
            treeSet.add(i);
        }
    }

    public static long addEffectivityCounter(LinkedList linkedList, int numberOfElements) {
        Random random = new Random();
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = linkedList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            linkedList.add(startPosition + i, random.nextInt(linkedList.size() * 2));
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }

        return finalResult;
    }

    public static long addEffectivityCounter(ArrayList arrayList, int numberOfElements) {
        Random random = new Random();
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = arrayList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            arrayList.add(startPosition + i, random.nextInt(arrayList.size() * 2));
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }

        return finalResult;
    }

    public static long addEffectivityCounter(HashSet hashSet, int numberOfElements) {
        Random random = new Random();
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            hashSet.add(random.nextInt(hashSet.size()) + 1000001);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }

        return finalResult;
    }

    public static long addEffectivityCounter(TreeSet treeSet, int numberOfElements) {
        Random random = new Random();
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            treeSet.add(random.nextInt(treeSet.size()) + 1000001);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }

        return finalResult;
    }
    //////////////////////////////////////////////////////////////////////////////////////////

    public static long getEffectivityCounter(ArrayList arrayList, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = arrayList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            arrayList.get(startPosition + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;

    }

    public static long getEffectivityCounter(LinkedList linkedList, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = linkedList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            linkedList.get(startPosition + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    public static long removeEffectivityCounter(ArrayList arrayList, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = arrayList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            arrayList.remove(startPosition + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;

    }

    public static long removeEffectivityCounter(LinkedList linkedList, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        int startPosition = linkedList.size() / 2;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            linkedList.remove(startPosition + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;
    }

    public static long removeEffectivityCounter(HashSet hashSet, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            hashSet.remove((hashSet.size() / 2) + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;
    }


    public static long removeEffectivityCounter(TreeSet treeSet, int numberOfElements) {
        long results[] = new long[numberOfElements];
        long start, stop, finalResult = 0;
        for (int i = 0; i < numberOfElements; i++) {
            start = System.nanoTime();
            treeSet.remove((treeSet.size() / 2) + i);
            stop = System.nanoTime();
            results[i] = stop - start;
        }
        for (long l : results
                ) {
            finalResult += l;
        }
        return finalResult;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////



