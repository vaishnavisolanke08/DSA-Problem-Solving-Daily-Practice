import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        // add()
        names.add("math");
        names.add("phy");
        names.add("chem");
        System.out.println(names); // [math, phy, chem]
        
        // get()
        System.out.println(names.get(1)); // phy
        
        // set()
        names.set(1, "bio");
        System.out.println(names); // [math, bio, chem]
        
        // remove(index)
        names.remove(0);
        System.out.println(names); // [bio,chem]
        
        // remove(Object)
        names.remove("bio");
        System.out.println(names); // [chem]
        
        // isEmpty()
        System.out.println(names.isEmpty()); // false

        System.out.println(names);
        
        
        // Iteration (MOST USED)
        for(String s : names){
            System.out.println(s);
        }

    }
}
