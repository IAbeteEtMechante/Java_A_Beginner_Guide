package chapters.chapter06;

/*
A queue class for characters
 */

class Stack {
    private int top;
    int arraySize;
    private char[] underlyingArray;

    Stack(int arraySize) {
        top = 0;
        this.arraySize = arraySize;
        this.underlyingArray = new char[arraySize];
    }

    public void push(char c) {
        if (this.top == this.arraySize) {
            System.out.println("Cannot add, the stack is full already");

        } else {
            this.underlyingArray[this.top++] = c;
        }
    }

    public char pop() {
        if (this.top == 0) {
            System.out.println("Cannot get anything, the stack is empty.");
            return '\0';
        } else {
            return this.underlyingArray[--top];
        }
    }



}

