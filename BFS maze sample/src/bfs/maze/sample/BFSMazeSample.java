/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs.maze.sample;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Alex_
 */
public class BFSMazeSample {

    static class node {

        int y;

        node() {
        }

        node(int _y) {
            y = _y;
        }
    }
    static LinkedList<node> Q = new LinkedList();
    static int n;
    static String s = new String();
    static int dis[] = new int[101];

    static boolean ok(int y) {
        return y >= 0 && y < n && s.charAt(y) != '0' && dis[y] == -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int d = in.nextInt();
        for (int i = 0; i < n; i++) {
            dis[i] = -1;
        }
        int ty = n - 1;
        s = in.next();
        dis[0] = 0;
        Q.push(new node(0));

        while (Q.size() > 0) {
            node tmp = Q.peek();
            Q.pop();
            for (int i = 1; i <= d; i++) {

                int y = tmp.y + i;
                if (ok(y)) {
                    dis[y] = dis[tmp.y] + 1;
                    Q.push(new node(y));
                }
            }
        }
        System.out.println(dis[ty]);

    }

}
