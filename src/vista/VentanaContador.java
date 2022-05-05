/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Contador;

/**
 *
 * @author Juan Sebastian Getial Getial <getial.juan@correounivalle.edu.co>
 * Clase que representa la interfaz grafica del contandor
 */
public class VentanaContador extends JFrame 
{
    private JButton btnModificar;
    private JLabel lblContador;
    private Container contenedorPrincipal; 
    //Contador
    private Contador miContador;
    
    public VentanaContador()
    {
        iniciarComponentes();
        setSize(350,150);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Que se termine la app cuando se cierre la ventana
        setTitle("Contador");
    }
    
    private void iniciarComponentes()
    {
        //Se intancia el contandor
        miContador = new Contador();
        
        //Se inician los componentes de la ventana
        btnModificar = new JButton("Modificar");
        btnModificar.setBackground(Color.red);
        lblContador = new JLabel("0",JLabel.CENTER);
        lblContador.setOpaque(true);
        lblContador.setBackground(Color.yellow);
        
        contenedorPrincipal = getContentPane();
        contenedorPrincipal.setLayout(new GridLayout(2,1));
        contenedorPrincipal.add(lblContador);
        contenedorPrincipal.add(btnModificar);
        
        //Se le agrega el listener
        btnModificar.addMouseListener(new ManejadorEventos());
    }
    
    private class ManejadorEventos implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent me) {
            
            //Segun el boton dado se realiza una accion en el contador
            if(me.getButton()==1)
            {
                miContador.aumentarContador();
            }
            else if(me.getButton()==3)
            {
                miContador.disminuirContador();
            }
            else if(me.getButton()==2)
            {
                int decision = JOptionPane.showConfirmDialog(null, "¿Realmente desea resetear el contador?", "Confirmar reseteo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(decision == 0)
                {
                    miContador.resetearContador();
                }
            }
            lblContador.setText(miContador.getCuenta()+"");
        }

        @Override
        public void mousePressed(MouseEvent me) {
            //System.out.println("");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            //System.out.println("");
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            //System.out.println("");
        }

        @Override
        public void mouseExited(MouseEvent me) {
            //System.out.println("");
        }
    }
}
