import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
public class CopyOnWriteArraySetTest {
    public static void main(String args[])  {
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("a");
        copyOnWriteArraySet.add ("b");
        Iterator<String> iterator = copyOnWriteArraySet.iterator();
        while(iterator.hasNext()) {
            copyOnWriteArraySet.add("c");
            System.out.println(iterator.next());
        }
        System.out.println("----------");
        iterator = copyOnWriteArraySet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}