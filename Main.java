import java.util.PriorityQueue;

class Node implements Comparable<Node>{
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override 
    public int compareTo(Node o){
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // SuperCar car = new SuperCar("붕붕이");
        // car.ride();
    }
}
