package LinkedLists;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListsMethods {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        System.out.println(list);
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);
        System.out.println("------------------------------------------------");

        // addFirst()
        System.out.println(list);
        list.addFirst("First");
        System.out.println("After addFirst(): " + list);
        System.out.println("------------------------------------------------");

        // addLast()
        System.out.println(list);
        list.addLast("Last");
        System.out.println("After addLast(): " + list);
        System.out.println("------------------------------------------------");

        // getFirst()
        System.out.println(list);
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("------------------------------------------------");

        // getLast()
        System.out.println(list);
        System.out.println("getLast(): " + list.getLast());
        System.out.println("------------------------------------------------");

        // removeFirst()
        System.out.println(list);
        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // removeLast()
        System.out.println(list);
        System.out.println("removeLast(): " + list.removeLast());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // offerFirst()
        System.out.println(list);
        list.offerFirst("NewFirst");
        System.out.println("After offerFirst(): " + list);
        System.out.println("------------------------------------------------");

        // offerLast()
        System.out.println(list);
        list.offerLast("NewLast");
        System.out.println("After offerLast(): " + list);
        System.out.println("------------------------------------------------");

        // pollFirst()
        System.out.println(list);
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // pollLast()
        System.out.println(list);
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // peekFirst()
        System.out.println(list);
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // peekLast()
        System.out.println(list);
        System.out.println("peekLast(): " + list.peekLast());
        System.out.println(list);
        System.out.println("------------------------------------------------");

        // descendingIterator()
        System.out.println("Descending Iterator:");
        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("------------------------------------------------");
    }
}
