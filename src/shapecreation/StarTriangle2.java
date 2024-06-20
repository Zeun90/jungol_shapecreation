package shapecreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StarTriangle2 {
    final static String star = "*";
    final static String space = " ";

    public static void main(String[] args) throws IOException {
        StarTriangle2 st2 = new StarTriangle2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        if (size < 1 || 100 < size || size % 2 == 0) {
            System.out.println("INPUT ERROR!");
        } else {
            st2.star(size);
        }
    }

    public void star(int size) {
        int spaceMaxSize = size / 2;
        int starMaxSize = size / 2 + 1;

        for (int i = starMaxSize; i > 1; i--) {
            for (int j = 0; j < starMaxSize - i; j++) {
                System.out.print(space);
            }
            System.out.println(star.repeat(i));
        }

        for (int i = 1; i <= starMaxSize; i++) {
            System.out.print(space.repeat(spaceMaxSize));
            System.out.println(star.repeat(i));
        }
    }
}
