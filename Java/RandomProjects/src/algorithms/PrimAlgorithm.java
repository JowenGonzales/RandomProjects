/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author JOWEN
 */
public class PrimAlgorithm {
    
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };
        int[] parent = primMST(graph);
        System.out.println("Edge   Weight");
        for (int i = 1; i < graph.length; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
        }
    }
    
    public static int[] primMST(int[][] graph) {
        int[] parent = new int[graph.length];
        int[] key = new int[graph.length];
        boolean[] mstSet = new boolean[graph.length];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);
        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < graph.length - 1; i++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        return parent;
    }
    public static int minKey(int[] key, boolean[] mstSet) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < key.length; i++) {
            if (!mstSet[i] && key[i] < minValue) {
                minIndex = i;
                minValue = key[i];
            }
        }
        return minIndex;
    }
    
}
