/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_gui;

import java.awt.Color;//libreria de color 
import javax.swing.JFrame;//libreria para crear la ventana
import javax.swing.*;//libreria swing

/**
 *
 * @author ASUS
 */
public class Ventana_GUI extends JFrame {//se le agrega extends para la ventana

    public Ventana_GUI() {//constructor
        this.setTitle("Practica GUI");// titulo de la Ventana
        this.setBounds(200, 100, 500, 600);//localizcion de la ventana y tamaño
        JLabel e1 = new JLabel();//se crea el objeto
        e1.setText("Anota tu nombre:");//se anota el texto 
        e1.setForeground(Color.blue);//agregar un color a las letras
        e1.setBounds(15, 70, 350, 350);//localizacion y tamaño 
        this.add(e1);//se agrega al frame

        JTextField cuadro = new JTextField();//se crea el objeto con JField para cuadros
        cuadro.setText("");//espacio en blanco
        cuadro.setBounds(130, 230, 100, 25);//localizacion y tamaño
        this.add(cuadro);//se agrega el cadro de texto al frame

        JTextField cuadro2 = new JTextField();
        cuadro2.setText("");
        cuadro2.setBounds(100, 265, 120, 25);
        this.add(cuadro2);

        JLabel contra = new JLabel();
        contra.setText("Anota una contraseña:");
        contra.setForeground(Color.blue);
        contra.setBounds(0, 140, 300, 200);
        this.add(contra);

        JButton boton2 = new JButton();//se crea un boton com JButton
        boton2.setText("INGRESAR");//se le pone un nombre al boton
        boton2.setBounds(100, 350, 100, 56);//localizacion y tamaño
        this.add(boton2);//se agrega el boton al frame

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre el programa al ejecutar
        this.add(e1);//
    }

    public static void main(String[] args) {
        Ventana_GUI obj = new Ventana_GUI();//instanciasion 
        obj.setVisible(true);//ventana visible
        obj.setLayout(null);

    }
}
