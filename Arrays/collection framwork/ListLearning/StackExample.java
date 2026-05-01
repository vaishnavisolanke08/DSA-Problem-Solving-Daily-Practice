
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        //  push()
        
        stack.push(90);
        stack.push(60);
        stack.push(50);
        System.out.println(stack); // [90, 60, 50]//push means add element of the stack
    
        // pop()
        System.out.println(stack.pop()); // 50 //remove 50
        System.out.println(stack); // [90, 60]
    
        // peek()
        System.out.println(stack.peek()); // 60
    
        // empty()
        System.out.println(stack.empty()); // false
    
        // search()
        System.out.println(stack.search(90)); // 2 (1-based index)
    }
}