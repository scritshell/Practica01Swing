/*
* Proyecto: swing_p01_CsibiSebastian
* Paquete: vista
* Archivo: VentanaI.java
* @author Sebastian Csibi
* Fecha: 14 oct 2025 19:50:49
*
* Descripción:
* Crea la ventana que se mostrara al usuario, llamando al panel. Tambien se le agrega un icono (IES ALANDALUS)
*
* Licencia:
* Todos los derechos reservados
*/
package vista;

import javax.swing.*;
/**
 * VentanaI: JFrame principal de la aplicación. Contiene un PanelImagen
 * y se centra en pantalla, con un título y un icono personalizado.
 */
public class VentanaI extends JFrame {
	 /**
     * Constructor que inicializa la ventana principal:
     * - Tamaño y posición
     * - Icono de la ventana
     * - PanelImagen
     */
    public VentanaI() {
        super("Swing Práctica01 Sebastian Csibi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 440);
        this.setLocationRelativeTo(null); 
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/LogoInsti4.png")).getImage());
        PanelImagen panel = new PanelImagen();
        panel.setBounds(0, 0, 400, 400);
        this.setLayout(null);
        this.add(panel);

        this.setVisible(true);
    }
}
