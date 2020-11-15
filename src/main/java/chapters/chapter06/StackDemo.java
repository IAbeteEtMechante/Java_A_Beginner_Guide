package chapters.chapter06;

//Demonstrate the Stack class

class StackDemo {
    public static void main(String[] args) {

        Stack bigStack = new Stack(100);
        Stack smallStack = new Stack(4);

        //try to store the alphabet in it
        for (int i = 0; i < 26; i++) {
            bigStack.push((char) ('A' + i));
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(bigStack.pop());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            smallStack.push((char) ('A' + i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(smallStack.pop());
        }
        System.out.println();

    }
}
