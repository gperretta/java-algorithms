import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        // Adding elements to the linked list
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addLast("C");
        linkedList.addFirst("D");
        linkedList.add(2, "E");

        System.out.println(linkedList);
        System.out.println("\n");

        // Changing one element of the linked list
        linkedList.set(0, "Z");

        // Using get methods and loops
        for (int i = 0; i < linkedList.size(); i++) {

            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println("\n");

        // Removing elements from the linked list
        linkedList.remove("B");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
