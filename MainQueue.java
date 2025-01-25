import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        System.out.println("Please enter student name (enter 'quite' for exit the program):");

        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("quite")) {
                break;
            }

            System.out.println("Enqueue " + name);
            queue.enqueue(name);

            System.out.println(queue.toString() 
                + " [first = " + queue.getFront() 
                + ", rear = " + queue.getRear()
                + ", length = " + queue.length() + "]");
        }

        String removed = queue.dequeue();
        if (removed != null) {
            System.out.println("Dequeue " + removed);
            System.out.println(queue.toString()  + " [first = " + queue.getFront() + ", rear = " + queue.getRear()+ ", length = " + queue.length() + "]");
        }
    }
}
