import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add("Good");
        l1.add("morning");
        if(l1.contains(3))
        {
            System.out.println("The element exist in the list.");
        }
        else
        {
            System.out.println("The element doesn't exist in the list.");
        }
    }
}
