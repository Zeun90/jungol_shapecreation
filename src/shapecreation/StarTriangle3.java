package shapecreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StarTriangle3 {

    final static String star = "*";
    final static String space = " ";

    public static void main(String[] args) throws IOException {
        StarTriangle3 st3 = new StarTriangle3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        if (size < 1 || 100 < size || size % 2 == 0) {
            System.out.println("INPUT ERROR!");
        } else {
            st3.star(size);
        }
    }

    public void star(int size) {
        for (int i = 1; i <= size / 2 + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(space);
            }
            System.out.println(star.repeat(i * 2 - 1));
        }

        for (int i = size / 2; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(space);
            }
            System.out.println(star.repeat(i * 2 - 1));
        }
    }
}
