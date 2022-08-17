package linkedlist;

public class TestLinkedList {

    public static final String SPACE = "/=";

    public static void main(String[] args) {

        System.out.println(SPACE+SPACE+SPACE+SPACE +
                "TESTING" +SPACE+SPACE+SPACE+SPACE);
        LinkedList mylinkedlist = new LinkedList(10);
        mylinkedlist.addFirst(11);
        mylinkedlist.addFirst(12);
        mylinkedlist.addFirst(13);
        mylinkedlist.addFirst(14);
//        mylinkedlist.printList();

        mylinkedlist.add(5,9);
        mylinkedlist.add(6,8);
        mylinkedlist.printList();
    }

}
