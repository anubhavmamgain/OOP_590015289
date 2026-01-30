import java.util.Scanner;

class Static1 {

    int n = 0;
    //static int sn;

    public static void main(String[] args) {

        Static1 m = new Static1();

        //int n;

        try (Scanner s = new Scanner(System.in)) {
            m.n = s.nextInt();
            //n = s.nextInt();

            //System.out.println(n);
            System.out.println(m.n);
        }
    }
}
