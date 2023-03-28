import java.util.HashSet;


public class EHash {
    public static void main(String[] args) {
        HashSet h1=new HashSet<>();
        h1.add("Good ");
        h1.add("Morning ");
        h1.add("to ");
        h1.add("all ");
        HashSet h2=new HashSet<>();
        h2.add("Good ");
        h2.add("Morning ");
        h2.add("you ");
        h2.add("all ");
        if(h1.equals(h2))
        {
            System.out.println("Both the hashsets are equal.");
        }
        else {
            System.out.println("Both the hash-sets aren't equal.");
        }
    }
}
