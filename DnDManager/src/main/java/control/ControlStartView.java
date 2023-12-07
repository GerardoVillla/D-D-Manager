package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.*;
import view.*;
import control.*;


public class ControlStartView implements ActionListener{
	private CharacterDao cd;
	private StoreDao sd;
	private StartView startView;
	public ControlStartView(CharacterDao cd, StoreDao sd, StartView startView) {
		this.cd=cd;
		this.sd=sd;
		this.startView=startView;
		this.startView.getConsultarPersonaje().addActionListener(this);
		this.startView.getTienda().addActionListener(this);
		this.startView.getCrearPersonaje().addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startView.getCrearPersonaje()) {
			Creacion_Personaje cp= new Creacion_Personaje();
			ControlCreacionPersonaje ccp=new ControlCreacionPersonaje(cd,cp);
			cp.setVisible(true);
		}
		
	}
	
	

}
