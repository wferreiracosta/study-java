package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizar na tela do computador

        JButton botao = new JButton("Cliclar");
        janela.add(botao);

//        botao.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello, World!");
//            }
//        });

        botao.addActionListener(e -> {
            System.out.println("Hello, World!!!");
        });

        botao.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //Ganhou focus
            }

            @Override
            public void focusLost(FocusEvent e) {
                //perdeu focus
            }
        });

        janela.setVisible(true);
    }
}
