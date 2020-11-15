package chapters.chapter05;

/*
   Self Test
   Adapt the Bubble sort to sort a String Array.
*/

class BubbleString {
    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Pear",
                "Coconut", "Mango", "Cherry",
                "Strawberry", "Kiwi", "PineApple", "Lemon"};

        int size;

        size = stringArray.length; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + stringArray[i]);
        }
        System.out.println();

        // This is the bubble sort.
        int a;
        for (a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (stringArray[b - 1].compareTo(stringArray[b]) > 0) { // if out of order
                    // exchange elements
                    String t;
                    t = stringArray[b - 1];
                    stringArray[b - 1] = stringArray[b];
                    stringArray[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + stringArray[i]);
        }
        System.out.println();
    }
}
