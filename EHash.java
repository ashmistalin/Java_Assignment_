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


OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=13537:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi EHash

Both the hash-sets aren't equal.

Process finished with exit code 0

