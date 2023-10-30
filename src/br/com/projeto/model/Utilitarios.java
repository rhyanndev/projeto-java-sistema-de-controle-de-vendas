/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.model;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author Loja
 */
public class Utilitarios {

    public void LimpaTela(JPanel container) {
        
        //método vai percorre cada campo do
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }

}
