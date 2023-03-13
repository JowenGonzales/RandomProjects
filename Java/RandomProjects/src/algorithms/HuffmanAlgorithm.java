/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author JOWEN
 */
public class HuffmanAlgorithm {
    
    private static class Node implements Comparable<Node> {
        char c;
        int freq;
        Node left;
        Node right;
        
        public Node(char c, int freq, Node left, Node right) {
            this.c = c;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
        
        
        @Override
        public int compareTo(Node t) {
            return this.freq - t.freq;
        }
    }
    // Build the Algorithm
    private static Node buildTree(Map<Character, Integer> freqTable) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (char c : freqTable.keySet()) {
            pq.offer(new Node(c, freqTable.get(c), null, null));
        }
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.offer(new Node('\0', left.freq + right.freq, left, right));
        }
        return pq.poll();
    }
    // Buuild the Table
    private static void generateCodeTable(Node root, String code, Map<Character, String> codeTable) {
        if (root == null) {
            return;
        }
        if (root.c != '\0') {
            codeTable.put(root.c, code);
        }
        generateCodeTable(root.left, code + "0", codeTable);
        generateCodeTable(root.right, code + "1", codeTable);
        
    }
    // Compress Algorithm
    public static String compress(String input) {
    }
    
    public HuffmanAlgorithm() {
        
    }
}
