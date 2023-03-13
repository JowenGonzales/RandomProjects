/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashMap;
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
        Map<Character, Integer> freqTable = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqTable.put(c, freqTable.getOrDefault(c, 0) + 1);
        }
        Node root = buildTree(freqTable);
        
        // Generate Code Table
        Map <Character, String> codeTable = new HashMap<>();
        generateCodeTable(root, "", codeTable);
        
        // Compress the String
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(codeTable.get(c));
        }
        return sb.toString();
    }
    
    // Decompress Algorithm
    
    public static String decompress(String compressed, Node root) {
        StringBuilder sb = new StringBuilder();
        Node current = root;
        for (char bit : compressed.toCharArray()) {
            if (bit == '0') {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current.c != '\0') {
                sb.append(current.c);
                current = root;
            }
        }
        return sb.toString();
    }
    
    
    
    public static void main(String[] args) {
        String input = "Hello World";
        String compressed = compress(input);

        // Build frequency table
        Map<Character, Integer> freqTable = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqTable.put(c, freqTable.getOrDefault(c, 0) + 1);
        }

        // Build Huffman tree
        Node root = buildTree(freqTable);

        String decompressed = decompress(compressed, root);
        System.out.println("Compressed string: " + compressed);
        System.out.println("Decompressed string: " + decompressed);
    }
}
