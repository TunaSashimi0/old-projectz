/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloth.drying;

import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class ClothDrying {

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int i;
    static int W[] = new int[i];
    static int a;
    static int b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        N = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for (int x = 0; x < N; x++) {
            W[i] = sc.nextInt();

        }
        System.out.println(search(W));
    }

    static int search(int a[]) {
        int l = 0, r = 100000;
        while (l < r) {
            int mid = (l + r) / 2;
            if (sum(mid) >= mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public static int sum(int t) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (W[i] - a * t > 0) {
                sum = sum + (W[i] - a * t + b - 1) / b;
            }
        }
        return sum;
    }
}
