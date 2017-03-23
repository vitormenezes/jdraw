package model;

import java.awt.Graphics;

public abstract class FormaGeometrica {
    protected String cor;
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract void paint(Graphics g);
}
