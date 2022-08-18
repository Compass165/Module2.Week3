package stack;

public class StackClient {

    public static void main(String[] args) {
//        chuoi
        Stack<String> stringStack = new Stack<>();
        String string = "made by Nguyen Duy Phong";
        String[] strings = string.split("\\s");

        System.out.println("Integer array is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
        System.out.println();

        for (String s : strings) {
            stringStack.push(s);
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringStack.pop();
        }
        System.out.println("Integer array after reverse is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
        System.out.println();
        System.out.println();


//        so
        Stack<Integer> stack1 = new Stack<>();
        Integer[] integers = new Integer[5];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        System.out.println("Integer array is: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + "\t");
        }
        System.out.println();

        for (Integer integer : integers){
            stack1.push(integer);
        }

        for (int i = 0; i < integers.length; i++){
            integers[i] = stack1.pop();
        }

        System.out.println("Integer array after reverse is: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + "\t");
        }
    }
}
