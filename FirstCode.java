import java.util.*;

public class FirstCode {
    public static void main(String[] args) {

        String str[] = new String[5];

        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                str[i] = s.nextLine();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }
    }
}