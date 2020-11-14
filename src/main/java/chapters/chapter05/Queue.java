package chapters.chapter05;

/*
A queue class for characters
 */

class Queue {
    int left;
    int right;
    int arraySize;
    char[] underlyingArray;

    Queue(int arraySize) {
        this.left = 0;
        this.right = 0;
        this.arraySize = arraySize;
        this.underlyingArray = new char[arraySize];
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

