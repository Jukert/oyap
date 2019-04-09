class QueueFullException extends RuntimeException {

    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }

}

class QueueEmptyException extends RuntimeException {

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }

}

class PriorityQueue {

    private int[] priorQueueArgs;
    private int size;//Size of Queue
    private int number;  //holds number of elements in Priority Queue, initialized with 0 by default

    public PriorityQueue(int size) {
        this.size = size;
        priorQueueArgs = new int[this.size];
        number = 0;
    }

    public void insert(int value) {
        int i;
        if (isFull()) {
            throw new QueueFullException("Cannot insert " + value + ", Queue is full");
        }
        if (number == 0) {
            priorQueueArgs[number++] = value; //If no values in PriorityQueue- insert at starting position, i.e. at 0th position.
        } else {
            for (i = number - 1; i >= 0; i--) {
                if (value > priorQueueArgs[i])
                    priorQueueArgs[i + 1] = priorQueueArgs[i]; //if value is larger, shift elements upward till value is larger.
                else
                    break;
            }
            priorQueueArgs[++i] = value; // insert element in space created by upward shift of elements.
            number++;
        }
    }


    public int remove() {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return priorQueueArgs[--number];
    }

    public boolean isFull() {
        return (number == size);
    }

    public boolean isEmpty() {
        return (number == 0);
    }


}

