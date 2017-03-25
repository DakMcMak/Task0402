public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            applesPrice = applesPrice + 50;
            System.out.println(applesPrice);
            applesPrice = applesPrice + 100;
            System.out.println(applesPrice);
        }
    }
}
