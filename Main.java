package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner zxc = new Scanner(System.in);
        System.out.print("w=");
        int w = zxc.nextInt();
        System.out.print("h=");
        int h = zxc.nextInt();
        System.out.print(picture(w, h));
    }
    public static int picture(int w, int h) {
        for (int p = 1; ; p++) {
            for (int k = 0; k < w; ) {
                for (int i = 0; i <= 9; i++) {
                    System.out.print(i);
                    k++;
                    if (k == w) {
                        System.out.print("\n");
                        for (int l = 0; l < p; l++) {
                            System.out.print(" ");
                        }
                        break;
                    }

                }
            }
            if (p == h) {
                System.exit(0);
            }
            w--;
        }
    }
}
