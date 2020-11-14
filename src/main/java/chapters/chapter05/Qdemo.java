package chapters.chapter05;

//Demonstrate the Queue class

class Qdemo {
    public static void main(String[] args) {

        Queue bigQueue = new Queue(100);
        Queue smallQueue = new Queue(4);

        //try to store the alphabet in it
        for (int i = 0; i < 26; i++) {
            bigQueue.put((char) ('A' + i));
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(bigQueue.getElement());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            smallQueue.put((char) ('A' + i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(smallQueue.getElement());
        }
        System.out.println();

    }
}
