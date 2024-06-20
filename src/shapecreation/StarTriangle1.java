package shapecreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StarTriangle1 {
    static final String star = "*";
    static final String space = " ";

    public static void main(String[] args) throws IOException {
        StarTriangle1 st1 = new StarTriangle1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int type = Integer.parseInt(st.nextToken());

        if (size < 1 || 100 < size || type < 1 || 3 < type) {
            System.out.println("INPUT ERROR!");
        } else {
            switch (type) {
                case 1:
                    st1.star1(size);
                    break;
                case 2:
                    st1.star2(size);
                    break;
                case 3:
                    st1.star3(size);
                    break;
            }
        }
    }

    public void star1(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println(star.repeat(i));
        }
    }

    public void star2(int size) {
        for (int i = size; i > 0; i--) {
            System.out.println(star.repeat(i));
        }
    }

    public void star3(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(space.repeat(size - i));
            System.out.println(star.repeat(i * 2 - 1));
        }
    }
}
