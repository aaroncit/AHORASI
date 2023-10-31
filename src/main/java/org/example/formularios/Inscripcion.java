// LoginForm.java (en el paquete org.example.formularios)
package org.example.formularios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JFrame frame;

    public LoginForm() {
        frame = new JFrame("Inicio de Sesión");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón, abrir la ventana principal
                MainWindow mainWindow = new MainWindow();
                mainWindow.mostrarVentana();
                frame.dispose(); // Cierra la ventana de inicio de sesión
            }
        });

        frame.add(loginButton);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}



