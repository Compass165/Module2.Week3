package arraylist;

public class TestMyList {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger = new MyList<>(10);
        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 4);
        System.out.println();

        listInteger.add(4, 5);
        System.out.println("----Mang cho san----");
        System.out.println(listInteger);
        System.out.println();

        System.out.println("----Cat phan tu cua mang----");
        System.out.print("Phan tu da bi cat la: ");
        System.out.println(listInteger.remove(3)+"\t");
        System.out.print("Mang da bi cat: ");
        System.out.println(listInteger);
        System.out.println();

        System.out.println("----Clone Mang---");
        MyList<Integer> listInter1 = new MyList<>();
        listInter1 = (MyList<Integer>) listInteger.clone();
        System.out.println("Mang moi: "+listInter1);


//        System.out.println(listInteger.size());
    }

}
