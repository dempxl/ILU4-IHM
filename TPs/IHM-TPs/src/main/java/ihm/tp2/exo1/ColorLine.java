/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ihm.tp2.exo1;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author logan
 */
public class ColorLine {
        Point start, end;
        Color color;
        
        ColorLine(Point s, Point e, Color c){
            this.start = new Point(s);
            this.end = new Point(e);
            this.color = c;
        }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public Color getColor() {
        return color;
    }
        
        
}
