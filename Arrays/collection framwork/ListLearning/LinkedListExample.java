import java.util.LinkedList;


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> l2 = new LinkedList<>();
        
        // add()
        l2.add(40);
        l2.add(70);
        l2.add(90);
        System.out.println(l2);
       
        // addFirst() / addLast()
        l2.addFirst(7);
        l2.addLast(50);
        System.out.println(l2); // [7, 40, 70, 90, 50]
        
        // getFirst() / getLast()
        System.out.println(l2.getFirst()); // 7
        System.out.println(l2.getLast()); // 50
        
        
        // removeFirst() / removeLast()
        l2.removeFirst();
        l2.removeLast();
        System.out.println(l2); // [40, 70, 90]
        
        // remove()
        l2.remove(Integer.valueOf(70));
        System.out.println(l2); // [40, 90]

    }
}
