/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;
//LIBRERIA AWT
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//LIBRERIA SWING
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Manejo_de_eventos extends JFrame {//CLASE PRINCIPAL

    private JPanel mi_panel;//PARA QUE LOS ELEMENTOS ESTEN DENTRO DE LA VENTANA 
    private JLabel captar_nombre;//COMPONENTE
    private JTextField nombre,nombre1;//COMPONENTE
    private JButton btn_aceptar;//COMPONENTE 

    public Manejo_de_eventos() {//CONSTRUCTOR

        setBounds(50, 50, 500, 500);//LOCALIZACION Y TAMAÑO DE LA VENTANA
        iniciar_componentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//PARA CERRAR LA VENTANA 

    }

    public void iniciar_componentes() {//METODO PARA DAR INICIO A LA VENTANA

        panel();
        Etiquetas();
        Etiquetas2();
        cajas_de_texto();
        cajas_de_texto2();
        botones();
    }

    private void panel() {
        mi_panel = new JPanel();//instansiacion
        mi_panel.setLayout(null);//ORGANICE TODO LO QUE ESTE DENTRO DE LA VENTANA
        this.add(mi_panel);//SE AGREGA EL ELEMENTO

    }

    private void Etiquetas() {//METODO DE ETIQUETA(TEXTO)
        captar_nombre = new JLabel("Ingrese un nombre:");//LO LLAMA DESDE EL CONSTRUCTOR

        captar_nombre.setBounds(30, 10, 200, 30);//LOCALIZACION Y TAMAÑO
        mi_panel.add(captar_nombre);//DIRECTO AL PANEL
    }
    private void Etiquetas2() {//METODO DE ETIQUETA(TEXTO)
        captar_nombre = new JLabel("Ingrese un apellido:");//LO LLAMA DESDE EL CONSTRUCTOR

        captar_nombre.setBounds(30, 90, 250, 70);//LOCALIZACION Y TAMAÑO
        mi_panel.add(captar_nombre);//DIRECTO AL PANEL
    }

    private void cajas_de_texto() {//METODO DE CAJA PARA LOS TEXTOS
        nombre1 = new JTextField();
        nombre1.setBounds(30, 50, 300, 30);//LOCALIZACION Y TAMAÑO
        //evento_teclado();//camptura desde el texto
        mi_panel.add(nombre1);//SE AGREGA
    }
    private void cajas_de_texto2() {//METODO DE CAJA PARA LOS TEXTOS
        nombre = new JTextField();
        nombre.setBounds(30, 150, 300, 30);//LOCALIZACION Y TAMAÑO
        //evento_teclado();//camptura desde el texto
        mi_panel.add(nombre);//SE AGREGA
    }

    private void botones() {//METODO PARA EL BOTON 
        btn_aceptar = new JButton("ACEPTAR");// SE CREA EL BOTON Y SU NOMBRE
        btn_aceptar.setBounds(150, 300, 150, 40);
        btn_aceptar.setFont(new Font("arial", 0, 15));//TIPO DE FUENTE,TAMAÑO,ETC, DE TEXTO
        evento_boton();//PARA ACTIVAR EL EVENTO
        mi_panel.add(btn_aceptar);//SE AGREGA 

    }

    public void evento_boton() {//EVENTO
        ActionListener captar_evento = new ActionListener() {//EVENTO POR RATON

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null,nombre1.getText()+" "+nombre.getText(), "DATOS CAPTURADOS DE:",JOptionPane.INFORMATION_MESSAGE);//CAPTURA TODO LO QUE SE ESCRIBA DENTRO DE LAS CAJAS DE 
            }
        };
        btn_aceptar.addActionListener(captar_evento);//SE ASOCIA EL EVENTO
    }

    public void evento_teclado() {
        KeyListener eventos_teclado = new KeyListener() {//EVENTO DESDE EL TECLADO, DESACTIVADO POR EL MOMENTO

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, null, "USTED A PRESIONADO UNA TECLA:",
                        JOptionPane.WARNING_MESSAGE);
            }
        };
        nombre.addKeyListener(eventos_teclado);// SE ASOCIA EL EVENTO

    }
    /**
     * 
     * @param args 
     */
    public static void main (String[] args) {
        Manejo_de_eventos obj = new Manejo_de_eventos();//instanciasion 
        obj.setVisible(true);//ventana visible
    }
}