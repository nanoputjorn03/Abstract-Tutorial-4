public class Queue {

    private String[] data;  
    private int front;     
    private int rear;     
    private int size;     

    public Queue() {
        data = new String[5];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == data.length);
    }

    public int length() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public void enqueue(String name) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue " + name);
        } else {
            data[rear] = name;
            rear++;
            size++;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return null;
        } else {
            String removed = data[front];
            data[front] = null;
            front++;
            size--;
            return removed;
        }
    }

    @Override
    public String toString() {
    
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            if (data[i] == null) {
                sb.append("null");
            } else {
                sb.append(data[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    
}
