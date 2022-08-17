package linkedlist;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i+1);
        }
        System.out.println(myLinkedList);

        for (int i = 0; i < 10; i++) {
            myLinkedList.addLast(myLinkedList.size()+1);
        }
        System.out.println(myLinkedList);
        for (int i = 0; i >=-10; i--) {
            myLinkedList.addFirst(i);
        }
        System.out.println(myLinkedList);
        System.out.println("Remove");
        myLinkedList.remove(0);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(10));
        System.out.println(myLinkedList.size());

    }

}
