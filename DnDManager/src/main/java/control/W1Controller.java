package control;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import dao.CharacterDao;
import dao.StoreDao;
import model.Store;

import java.awt.Cursor;
import java.awt.event.ActionEvent;

import view.*;

public class W1Controller implements ActionListener{
	
	private Window1 w1;
	private CharacterDao cd;
	private StoreDao sd;
	
	
	public W1Controller(CharacterDao cd, StoreDao sd,Window1 w1) {
		this.w1= w1;
		this.cd=cd;
		this.sd=sd;
		
		w1.getBtnAccept().addActionListener(this);
		w1.getBtnImport().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (w1.getBtnAccept() == e.getSource()) {
			String name = w1.getNameField().getText();
			String descripcion=w1.getDescriptionField().getText();
			Store store= new Store(name);
			sd.saveStore(store);
			
			
		}
		if(w1.getBtnImport() == e.getSource()) {
			StartView st= new StartView();
            ControlStartView csv=new ControlStartView(this.cd,this.sd,st);
            st.setVisible(true);
		}
		
	}
	
	
	
}
