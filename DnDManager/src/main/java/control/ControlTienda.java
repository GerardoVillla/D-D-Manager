package control;

import dao.*;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Tienda;
import model.Character;
import model.Equippable;
import model.Store;
import model.Usable;
public class ControlTienda implements ActionListener{
	private int indexStore;
	private int indexChar;
	private ArrayList<Character> characters;
	private ArrayList<Store>Stores;
	private CharacterDao cd;
	private StoreDao sd;
	private Tienda tienda;
	
	public ControlTienda(CharacterDao cd, StoreDao sd,Tienda tienda,int indexStore, int indexChar) {
		this.tienda=tienda;
		this.cd=cd;
		this.sd=sd;
		this.indexChar=indexChar;
		this.indexStore=indexStore;
		
	}
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
