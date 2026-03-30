/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ihm.tp2.exo1.exo2;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author logan
 */
public class ColorPoint {
    private final Color color;
    private final int thickness;
    private final Point point;

    public ColorPoint(Color color,Point point,int thickness) {
        this.point = point;
        this.color = color;
        this.thickness = thickness;
    }

    public Color getColor() {
        return color;
    }

    public int getThickness() {
        return thickness;
    }
    
    public Point getPoint() {
        return point;
    }
}
