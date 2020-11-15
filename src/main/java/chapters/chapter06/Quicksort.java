package chapters.chapter06;

// Try This 6-3 A simple version of the Quicksort.
class Quicksort {

    // Set up a call to the actual Quicksort method.
    static void qsort(char[] items) {
        qs(items, 0, items.length - 1);

    }

    // A recursive version of Quicksort for characters.
    private static void qs(char[] items, int left, int right) {
        int i;
        int j;

        i = left;
        j = right;
        char x;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) {
                i++;
            }
            while ((x < items[j]) && (j > left)) {
                j--;
            }

            if (i <= j) {
                char y;
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            qs(items, left, j);
        }
        if (i < right) {
            qs(items, i, right);
        }
    }
}