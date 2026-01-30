class StaticDemo {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        System.out.println(a);
        System.out.println(obj.b);
    }
}
