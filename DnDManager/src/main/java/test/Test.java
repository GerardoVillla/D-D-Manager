package test;
import control.*;
import dao.*;
import view.*;
import model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterDao cd=new CharacterDao();
		StoreDao sd=new StoreDao();
		StartView sv= new StartView();
		ControlStartView csv=new ControlStartView(cd,sd, sv);
		sv.setVisible(true);

	}

}
