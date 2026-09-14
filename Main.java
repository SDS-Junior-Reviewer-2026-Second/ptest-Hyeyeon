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

    static void A () {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.create("Latte", "l");
    }

    static void D (Coffee coffee) {
        coffee.drank();
        //히히 이렇게 드링켜~~
    }
    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // SuperCar car = new SuperCar("붕붕이");
        // car.ride();


        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.create("Americano", "m");
    

        D(coffeeFactory.create("Latte", "s"));
        //이렇게 넘겨주어도 돼요 우히히
    }
}
