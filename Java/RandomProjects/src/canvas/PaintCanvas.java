/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author JOWEN
 */
public class PaintCanvas {
    
    
    
    public PaintCanvas() {
        Frame frame = new Frame();
        frame.add(new Canvas());
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new PaintCanvas();
    }
}

class MyCanvas extends Canvas{
    public MyCanvas() {
        setSize(400, 400);
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(0, 0, 100, 100);
    }
}
