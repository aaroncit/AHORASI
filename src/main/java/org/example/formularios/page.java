// MainWindow.java (en el paquete org.example.formularios)
package org.example.formularios;

import javax.swing.*;

public class MainWindow {
    private JFrame frame;

    public MainWindow() {
        frame = new JFrame("Ventana Principal");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}


