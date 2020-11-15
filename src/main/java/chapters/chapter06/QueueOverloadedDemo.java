package chapters.chapter06;

//Demonstrate the Queue class

class QueueOverloadedDemo {
    public static void main(String[] args) {

        QueueOverloaded bigQueue = new QueueOverloaded(100);
        QueueOverloaded smallQueue = new QueueOverloaded(4);

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

        //we cannot do that anymore:
        //smallQueue.underlyingArray[2] = 3;
        //we would get an error at compilation

        //use the newly created overloaded constructor to copy a queue:

        for (int i = 0; i < 26; i++) {
            bigQueue.put((char) ('A' + i));
        }

        QueueOverloaded bigQueueCopy = new QueueOverloaded(bigQueue);
        System.out.println("We make a copy of the queue containing the alphabet:");

        for (int i = 0; i < 26; i++) {
            System.out.print(bigQueueCopy.getElement());
        }

        //use the newly created overloaded constructor to create a queue from an array of chars

        char[] myCharArray = {'j', 'a', 'v', 'a'};

        QueueOverloaded queueFromArray = new QueueOverloaded(myCharArray);
        System.out.println("\nNow we try to create a queue from an array of chars:");
        System.out.println("Size of the queue:" + queueFromArray.arraySize);
        System.out.println("Elements of the queue: ");

        for (int i = 0; i < 4; i++) {
            System.out.print(queueFromArray.getElement());
            if (i < 3) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}
