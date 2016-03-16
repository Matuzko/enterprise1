package enterprise1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsBase {
    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
    HashSet hashSet = new HashSet();
    TreeSet treeSet = new TreeSet();

    public CollectionsBase(int size) {
        CollectionsActs.fill(arrayList, size);
        CollectionsActs.fill(linkedList, size);
        CollectionsActs.fill(hashSet, size);
        CollectionsActs.fill(treeSet, size);
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public HashSet getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public TreeSet getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet treeSet) {
        this.treeSet = treeSet;
    }

    public String addEfectivity(int numberOfChanges) {
        long arrayListAddEffectivity = CollectionsActs.addEffectivityCounter(this.arrayList, numberOfChanges);
        long linkedListAddEffectivity = CollectionsActs.addEffectivityCounter(this.linkedList, numberOfChanges);
        long hashSetAddEffectivity = CollectionsActs.addEffectivityCounter(this.hashSet, numberOfChanges);
        long treeSetAddEffectivity = CollectionsActs.addEffectivityCounter(this.treeSet, numberOfChanges);
        String resultAddEffectivity = "ArrayList size: " + arrayList.size() + " has added " + numberOfChanges + " elements in average for " + arrayListAddEffectivity + " nanoseconds\n"
                + "LinkedList size: " + linkedList.size() + " has added " + numberOfChanges + " elements in average for " + linkedListAddEffectivity + " nanoseconds\n"
                + "HashSet size: " + hashSet.size() + " has added " + numberOfChanges + " elements in average for " + hashSetAddEffectivity + " nanoseconds\n"
                + "TreeSet size: " + treeSet.size() + " has added " + numberOfChanges + " elements in average for " + treeSetAddEffectivity + " nanoseconds\n";
        return resultAddEffectivity;

    }

    public String getEffectivity(int numberOfChanges) {
        long arrayListGetEffectivity = CollectionsActs.getEffectivityCounter(this.arrayList, numberOfChanges);
        long linkedListGetEffectivity = CollectionsActs.getEffectivityCounter(this.linkedList, numberOfChanges);
        String resultGetEffectivity = "ArrayList size: " + this.arrayList.size() + " has gotten " + numberOfChanges + " elements in average for " + arrayListGetEffectivity + " nanoseconds\n"
                + "LinkedList size: " + this.linkedList.size() + " has gotten " + numberOfChanges + " elements in average for " + linkedListGetEffectivity + " nanoseconds\n";
        return resultGetEffectivity;
    }

    public String removeEffectivity(int numberOfChanges) {
        long arrayListRemoveEffectivity = CollectionsActs.removeEffectivityCounter(this.arrayList, numberOfChanges);
        long linkedListRemoveEffectivity = CollectionsActs.removeEffectivityCounter(this.linkedList, numberOfChanges);
        long hashSetRemoveEffectivity = CollectionsActs.removeEffectivityCounter(this.hashSet, numberOfChanges);
        long treeSetRemoveEffectivity = CollectionsActs.removeEffectivityCounter(this.treeSet, numberOfChanges);
        String resultRemoveEffectivity = "ArrayList size: " + arrayList.size() + " has removed " + numberOfChanges + " elements in average for " + arrayListRemoveEffectivity + " nanoseconds\n"
                + "LinkedList size: " + linkedList.size() + " has removed " + numberOfChanges + " elements in average for " + linkedListRemoveEffectivity + " nanoseconds\n"
                + "HashSet size: " + hashSet.size() + " has removed " + numberOfChanges + " elements in average for " + hashSetRemoveEffectivity + " nanoseconds\n"
                + "TreeSet size: " + treeSet.size() + " has removed " + numberOfChanges + " elements in average for " + treeSetRemoveEffectivity + " nanoseconds\n";
        return resultRemoveEffectivity;
    }
}
