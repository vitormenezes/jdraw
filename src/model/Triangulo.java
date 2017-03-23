package model;

import java.awt.Graphics;

public class Triangulo extends FormaGeometrica{
    protected float altura;
    protected float base;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void paint(Graphics g) {
        int[] xs = {1, 2, 3};
        int[] ys = {2, 3, 4};
        g.drawPolygon(xs, ys, 2);
    }
}
