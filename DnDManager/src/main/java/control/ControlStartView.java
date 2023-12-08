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
			ControlCreacionPersonaje ccp=new ControlCreacionPersonaje(sd,cd,cp);
			cp.setVisible(true);
			startView.dispose();
		}
		if(e.getSource()==startView.getConsultarPersonaje()) {
			Window2 w2 = new Window2();
			W2Controller w2c=new W2Controller(cd,sd,w2);
			w2.setVisible(true);
			this.startView.dispose();
			
		}
		if(e.getSource()==startView.getTienda()) {
			ListaTiendasView ltv=new ListaTiendasView();
			ControlListaTiendas clt=new ControlListaTiendas(cd,sd,ltv);
			ltv.setVisible(true);
			this.startView.dispose();
			
		}
		
	}
	
	

}
