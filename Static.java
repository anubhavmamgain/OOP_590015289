import java.util.Scanner;

class Static {

    int n;
    static int sn;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Static m = new Static();

        int n;

        m.n = s.nextInt();
        n = s.nextInt();

        System.out.println(n);
        System.out.println(m.n);
    }
}
