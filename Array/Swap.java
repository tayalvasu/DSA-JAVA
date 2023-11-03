public class Swap {
    static void swapWithouttemp(int a, int b) {
        System.out.println("Orignal values before swap:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swap:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapWithouttemp(a, b);
    }
}
