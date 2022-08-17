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

        System.out.println("----check size mang: ----");
        System.out.println(listInteger.size());
        System.out.println();

        System.out.println("----Clone Mang---");
        MyList<Integer> listInter1 = new MyList<>();
        listInter1 = (MyList<Integer>) listInteger.clone();
        System.out.println("Mang moi: "+listInter1);
        System.out.println();

        System.out.println("----Check phan tu co trong mang tra ve true false----");
        System.out.println(listInteger.contains(5));
//        System.out.println(listInteger);
        System.out.println();

        System.out.println("----Kiem tra phan tu tra ve index----");
        System.out.println(listInteger.indexOf(3));
        System.out.println();

        System.out.println("----Tang dung luong mang----");
        listInteger.ensureCapacity(20);
        System.out.println(listInteger.size());
//        System.out.println(listInteger.ensureCapacity(20));
        System.out.println();

        System.out.println("----Lay gia tri----");
        System.out.println(listInteger.get(2));
        System.out.println();

        System.out.println("----Xoa het mang----");
        listInteger.clear();
        System.out.println(listInteger);
    }

}
