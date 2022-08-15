class Bike {
    void run() {
        System.out.println("running");
    }
}
public class Splender extends Bike {
    void run() {
        System.out.println(&quot;running safely with 60km&quot;);
    }
    public static void main(String args[]) {
        Bike b = new Splender();
        b.run();
    }
}