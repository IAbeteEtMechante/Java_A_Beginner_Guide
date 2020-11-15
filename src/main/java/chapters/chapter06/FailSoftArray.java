package chapters.chapter06;

/* This class implements a "fail-soft" array which prevents
   runtime errors.
 */
class FailSoftArray {
    private int[] internalArray; // reference to array
    private int errval; // value to return if get() fails

    public int length; // length is public

    /* Construct array given its size and the value to
       return if get() fails. */
    public FailSoftArray(int size, int errv) {
        internalArray = new int[size];
        errval = errv;
        length = size;
    }

    // Return value at given index.
    public int get(int index) {
        if (indexOk(index)) {
            return internalArray[index];
        }
        return errval;
    }

    // Put a value at an index. Return false on failure.
    public boolean put(int index, int val) {
        if (indexOk(index)) {
            internalArray[index] = val;
            return true;
        }
        return false;
    }

    // Return true if index is within bounds.
    private boolean indexOk(int index) {
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }
}

