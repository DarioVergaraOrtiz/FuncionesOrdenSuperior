package Model;

import javax.swing.*;
import java.awt.*;
import Interfaces.IDrawFigure;

public class FigurasApp extends JFrame {
    private Windows ventana;

    public FigurasApp() {
        setTitle("Dibujo de Figuras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana = new Windows();
        add(ventana, BorderLayout.CENTER);

        // Crear panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        // Botón Triángulo
        JButton btnTriangulo = new JButton("Triángulo");
        btnTriangulo.addActionListener(e -> ventana.setDrawAction(g -> {
            int[] xTriangulo = {100, 200, 150};
            int[] yTriangulo = {400, 400, 300};
            g.setColor(Color.BLUE);
            g.fillPolygon(xTriangulo, yTriangulo, 3);
        }));
        panelBotones.add(btnTriangulo);

        // Botón Cuadrado
        JButton btnCuadrado = new JButton("Cuadrado");
        btnCuadrado.addActionListener(e -> ventana.setDrawAction(g -> {
            g.setColor(Color.RED);
            g.fillRect(300, 300, 100, 100);
        }));
        panelBotones.add(btnCuadrado);

        // Botón Círculo
        JButton btnCirculo = new JButton("Círculo");
        btnCirculo.addActionListener(e -> ventana.setDrawAction(g -> {
            g.setColor(Color.GREEN);
            g.fillOval(500, 350, 80, 80);
        }));
        panelBotones.add(btnCirculo);

        add(panelBotones, BorderLayout.SOUTH);
    }
}