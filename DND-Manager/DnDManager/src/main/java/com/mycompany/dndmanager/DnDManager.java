
package com.mycompany.dndmanager;

import control.ControlCreacionPersonaje;
import view.Creacion_Personaje;
import view.StartView;

/**
 *
 * @author usuario
 */
public class DnDManager {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Creacion_Personaje CreacionP = new Creacion_Personaje();
        
		ControlCreacionPersonaje CF = new ControlCreacionPersonaje(null, CreacionP);
		CreacionP.setVisible(true);
    }
}
