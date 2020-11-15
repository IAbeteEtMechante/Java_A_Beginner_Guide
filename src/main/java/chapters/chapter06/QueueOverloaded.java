package chapters.chapter06;

/*
A queue class for characters, with an overloaded constructor
so that we can create a queue from another queue,
and we can create a queue from an array of chars.
 */

class QueueOverloaded {
    private int left;
    private int right;
    int arraySize;
    private char[] underlyingArray;

    QueueOverloaded(int arraySize) {
        this.left = 0;
        this.right = 0;
        this.arraySize = arraySize;
        this.underlyingArray = new char[arraySize];
    }

    QueueOverloaded(QueueOverloaded queue) {
        left = queue.left;
        right = queue.right;
        arraySize = queue.arraySize;
        underlyingArray = new char[arraySize];
        for (int i = left; i < right; i++) {
            underlyingArray[i] = queue.underlyingArray[i];
        }

    }

    /*
    This constructor create a queue double the size of
    the character array provided as argument
    and fills half of it with the elements of that array
     */
    QueueOverloaded(char[] charArray) {
        arraySize = charArray.length * 2;
        left = 0;
        right = 0;
        underlyingArray = new char[arraySize];
        for (int i = 0; i < charArray.length; i++) {
            put(charArray[i]);
        }
    }

    public void put(char c) {
        if (this.right == this.arraySize) {
            System.out.println("Cannot add, the queue is full already");

        } else {
            this.underlyingArray[this.right++] = c;
        }
    }

    public char getElement() {
        if (this.left == this.right) {
            System.out.println("Cannot get anything, the queue is empty.");
            return '\0';
        } else {
            return this.underlyingArray[left++];
        }
    }



}

