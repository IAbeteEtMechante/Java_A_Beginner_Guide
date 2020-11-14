package chapters.chapter05;

public class Qdemo {
    int left;
    int right;
    int arraySize;
    char[] underlyingArray;

    Qdemo(int left, int right, int arraySize) {
        this.left = left;
        this.right = right;
        this.arraySize = arraySize;
        this.underlyingArray = new char[arraySize];
    }

    public char add(char c) {
        if (this.right == this.arraySize) {
            System.out.println("Cannot add, the queue is full already");
            return '\0';
        } else {
            this.underlyingArray[this.right++] = c;
            return c;
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


    public static void main(String[] args) {
        Qdemo myQdemo = new Qdemo(0, 0, 10);
        myQdemo.add('H');
        char c = myQdemo.getElement();
        System.out.println(c);

    }
}
