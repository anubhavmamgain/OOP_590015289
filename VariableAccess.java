public class VariableAccess {
    class Inner {
        int x = 10;
    }

    public static void main(String[] args) {
        VariableAccess va = new VariableAccess();
        Inner obj = va.new Inner();
        System.out.println(obj.x);
    }
}

