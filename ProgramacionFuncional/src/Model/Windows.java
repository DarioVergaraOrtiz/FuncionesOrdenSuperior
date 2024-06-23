package Model;

import javax.swing.*;
import java.awt.*;
import Interfaces.IDrawFigure;

class Windows extends JPanel {
    private IDrawFigure drawAction = (Graphics g) -> {};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawAction.draw(g);
    }

    public void setDrawAction(IDrawFigure action) {
        this.drawAction = action;
        repaint();
    }
}