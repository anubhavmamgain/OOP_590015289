class A {
    int x = 10;
}

class ThisSuperDemo extends A {
    int x = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        ThisSuperDemo obj = new ThisSuperDemo();
        obj.show();
    }
}
