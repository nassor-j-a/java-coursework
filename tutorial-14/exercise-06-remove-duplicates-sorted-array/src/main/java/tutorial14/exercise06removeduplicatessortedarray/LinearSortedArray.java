package tutorial14.exercise06removeduplicatessortedarray;

import java.util.Arrays;

public class LinearSortedArray {

    private int[] a;
    private int nElems;

    public LinearSortedArray(int[] a, int nElems) {

        this.a = Arrays.copyOf(a, a.length);
        this.nElems = nElems;
    }

    // Approach 1: In-place compaction using two indexes
    public void removeDuplicates() {

        if (nElems <= 1) {
            return;
        }

        int write = 1;

        for (int read = 1; read < nElems; read++) {

            if (a[read] != a[write - 1]) {

                a[write] = a[read];
                write++;
            }
        }

        nElems = write;
    }

    // Approach 2: Repeated shifting
    public void removeDuplicatesByShifting() {

        int i = 0;

        while (i < nElems - 1) {

            if (a[i] == a[i + 1]) {

                for (int j = i + 1; j < nElems - 1; j++) {
                    a[j] = a[j + 1];
                }

                nElems--;

            } else {

                i++;
            }
        }
    }

    // Displays only the valid elements
    public void display() {

        System.out.println(Arrays.toString(Arrays.copyOf(a, nElems)));
    }

    public int getNElems() {
        return nElems;
    }
}