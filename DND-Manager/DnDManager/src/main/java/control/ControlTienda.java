package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Tienda;
import model.Character;
import model.Consumible;
import model.Equippable;
public class ControlTienda implements ActionListener{
	public Character Character;
	public Tienda Tienda;
	private ArrayList<Consumible> Consumibles = new ArrayList<Consumible>();
	private ArrayList<Equippable> Equippables = new ArrayList<Equippable>();
	
	public ControlTienda(Character Character, Tienda Tienda) {
		this.Character=Character;
		this.Tienda=Tienda;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
