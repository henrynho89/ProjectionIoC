package main;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {

	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		IDao dao = new DaoImpl();
		metier.setiDao(dao);
		System.out.println(metier.getCalcul());
	}

}
