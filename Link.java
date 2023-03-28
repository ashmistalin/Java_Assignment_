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
            System.out.println("The element exists in the list.");
        }
        else
        {
            System.out.println("The element doesn't exist in the list.");
        }
    }
}


OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=11920:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Link

The element exists in the list.

Process finished with exit code 0
