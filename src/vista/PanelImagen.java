/*
* Proyecto: swing_p01_CsibiSebastian
* Paquete: vista
* Archivo: PanelImagen.java
* @author Sebastian Csibi
* Fecha: 14 oct 2025 19:50:58
*
* Descripción:
* El panel con las imagenes, titulos y bordes con colores que representan cada estacion del año.
*
* Licencia:
* Todos los derechos reservados
*/
package vista;

import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 * PanelImagen: panel principal que contiene cuatro subpaneles pequeños
 * correspondientes a las estaciones del año. Cada subpanel incluye
 * un título y una imagen, con un borde de distinto distinto.
 */
public class PanelImagen extends JPanel {
	/**
     * Constructor que crea y posiciona los cuatro paneles verticales
     * (Primavera, Verano, Otoño, Invierno) dentro del panel principal.
     */
    public PanelImagen() {
        this.setLayout(null);

        // panel de primavera
        JPanel p1 = new JPanel(null);
        p1.setBounds(0, 0, 200, 200);
        p1.setBorder(new LineBorder(java.awt.Color.GREEN, 3));
        JLabel t1 = new JLabel("Primavera");
        t1.setBounds(10, 10, 100, 20);
        JLabel i1 = new JLabel(new ImageIcon(getClass().getResource("/recursos/primavera.jpg")));
        i1.setBounds(10, 40, 150, 150);
        
        p1.add(t1);
        p1.add(i1);
        this.add(p1);

        // panel de verano
        JPanel p2 = new JPanel(null);
        p2.setBounds(200, 0, 200, 200);
        p2.setBorder(new LineBorder(java.awt.Color.YELLOW, 3));
        JLabel t2 = new JLabel("Verano");
        t2.setBounds(10, 10, 100, 20);
        JLabel i2 = new JLabel(new ImageIcon(getClass().getResource("/recursos/desierto.jpg")));
        i2.setBounds(10, 40, 150, 150);
        
        p2.add(t2);
        p2.add(i2);
        this.add(p2);

        // panel de otoño
        JPanel p3 = new JPanel(null);
        p3.setBounds(0, 200, 200, 200);
        p3.setBorder(new LineBorder(java.awt.Color.ORANGE, 3));
        JLabel t3 = new JLabel("Otonio");
        t3.setBounds(10, 10, 100, 20);
        JLabel i3 = new JLabel(new ImageIcon(getClass().getResource("/recursos/otonio.jpg")));
        i3.setBounds(10, 40, 150, 150);
        p3.add(t3);
        p3.add(i3);
        this.add(p3);

        // panel de invierno
        JPanel p4 = new JPanel(null);
        p4.setBounds(200, 200, 200, 200);
        p4.setBorder(new LineBorder(java.awt.Color.CYAN, 3));
        JLabel t4 = new JLabel("Invierno");
        t4.setBounds(10, 10, 100, 20);
        JLabel i4 = new JLabel(new ImageIcon(getClass().getResource("/recursos/invierno.jpg")));
        i4.setBounds(10, 40, 150, 150);
        
        p4.add(t4);
        p4.add(i4);
        this.add(p4);
    }
}
